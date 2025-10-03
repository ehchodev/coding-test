function solution(n) {
    let answer = 0;
    
    for (let i=n; i>=1; i-=2) {
        answer += (n % 2 == 1) ? i : i * i;
    }
    
    return answer;
}
