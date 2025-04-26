function solution(n) {
    let answer = 1;
    
    while ((6 * answer) % n > 0) {
        answer++;
    }
    
    return answer;
}
