function solution(n, m) {
    const answer = [gcd(n, m), (n * m) / gcd(n, m)];
    return answer;
}

function gcd(num1, num2) {
    if (num1 % num2 === 0) {
        return num2;
    }
    return gcd(num2, num1 % num2);
}
