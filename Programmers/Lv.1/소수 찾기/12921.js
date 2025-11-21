function solution(n) {
    let answer = 0;
    
    const arr = new Array(n + 1).fill(false);
    for (let i = 2; i * i <= n; i++) {
        if (!arr[i]) {
            for (let j = i * i; j <= n; j += i) {
                arr[j] = true;
            }
        }
    }
    
    answer = arr.filter((v, i) => (i >= 2 && !v)).length;
    
    return answer;
}
