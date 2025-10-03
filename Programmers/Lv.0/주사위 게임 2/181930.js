function solution(a, b, c) {
    let answer = 0;
    
    if (a !== b && b != c && c != a) {
        answer = a + b + c;
    } else if (a !== b || b !== c) {
        answer = (a + b + c) * (a**2 + b**2 + c**2);
    } else {
        answer = (a * 3) * (a**2 * 3) * (a**3 * 3);
    }
    
    return answer;
}
