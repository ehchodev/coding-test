function solution(brown, yellow) {
    const answer = [];
    
    const sum = brown + yellow;
    for (let i = parseInt(sum / 2); i > 2; i--) {
        if (sum % i === 0) {
            const num1 = i, num2 = parseInt(sum / i);
            if (num1 > 2 && num2 > 2 && (num1 - 2) * (num2 - 2) === yellow) {
                answer.push(num1);
                answer.push(num2);
                break;
            }
        }
    }
    
    return answer;
}
