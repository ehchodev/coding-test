function solution(a, b) {
    let answer = 0;
    
    const num1 = Math.min(a, b);
    const num2 = Math.max(a, b);
    for (let i=num1; i<=num2; i++) {
        answer += i;
    }
    
    return answer;
}
