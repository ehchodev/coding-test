function solution(numer1, denom1, numer2, denom2) {
    let answer = [];
    
    // 계산
    const numer = (numer1 * denom2) + (numer2 * denom1);
    const denom = denom1 * denom2;
    
    // 최대공약수
    const gcd = getGCD(numer, denom);
    
    // 약분
    answer = [numer / gcd, denom / gcd];
    
    return answer;
}

// 최대공약수 구하기
function getGCD(num1, num2) {
    return (num1 % num2) ? getGCD(num2, num1 % num2) : num2;
}
