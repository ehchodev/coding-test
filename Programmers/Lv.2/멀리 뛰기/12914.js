function solution(n) {
    let answer = 0;
    
    const arr = [];
    for (let i = 1; i <= n; i++) {
        if (i <= 3) {
            arr.push(i);
        } else {
            arr.push( (arr[i - 3] + arr[i - 2]) % 1234567 );
        }
    }
    
    answer = arr[arr.length - 1];
    
    return answer;
}
