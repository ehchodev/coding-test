function solution(a, b) {
    let answer = 0;
    
    const num1 = +('' + a + b);
    const num2 = 2 * a * b;
    
    answer = (num1 > num2) ? num1 : num2;
    
    return answer;
}
