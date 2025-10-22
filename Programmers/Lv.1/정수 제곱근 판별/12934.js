function solution(n) {
    let answer = -1;
    
    const num1 = Math.sqrt(n);
    const num2 = parseInt(num1);
    
    if (num1 === num2) {
        answer = (num2 + 1) ** 2;
    }
    
    return answer;
}
