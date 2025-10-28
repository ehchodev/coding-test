function solution(a, b, n) {
    let answer = 0;
    
    while (n >= a) {
        const cnt = parseInt(n / a) * b;
        n = cnt + (n % a);
        answer += cnt;
    }
    
    return answer;
}
