function solution(arr) {
    let answer = 1;
    
    arr.forEach(v => {
        answer = lcm(answer, v);
    });
    
    return answer;
}

function gcd(a, b) {
    return (b === 0) ? a : gcd(b, a % b);
}

function lcm(a, b) {
    return (a * b) / gcd(a, b);
}
