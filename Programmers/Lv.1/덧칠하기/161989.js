function solution(n, m, section) {
    let answer = 0;
    
    const arr = new Array(n).fill(0);
    section.forEach(v => arr[v - 1] = 1);
    
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === 1) {
            for (let j = i; j < Math.min(i + m, arr.length); j++) {
                arr[j] = 0;
            }
            answer++;
        }
    }
    
    return answer;
}
