function solution(binomial) {
    let answer = 0;
    
    const [a, op, b] = binomial.split(' ');
    if (op === '+') answer = Number(a) + Number(b);
    else if (op === '-') answer = Number(a) - Number(b);
    else answer = Number(a) * Number(b);
    
    return answer;
}
