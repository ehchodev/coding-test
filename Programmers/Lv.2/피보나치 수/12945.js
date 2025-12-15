function solution(n) {
    let answer = 0;
    
    const arr = [];
    for (let i = 0; i <= n; i++) {
        if (i <= 1) arr.push(i);
        else arr.push( (arr[i - 1] + arr[i - 2]) % 1234567 );
    }
    
    answer = (arr[n - 1] + arr[n - 2]) % 1234567;
    
    return answer;
}
