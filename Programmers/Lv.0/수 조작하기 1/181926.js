function solution(n, control) {
    let answer = n;
    
    for (const s of [...control]) {
        if (s === 'w') {
            answer += 1;
        } else if (s === 's') {
            answer -= 1;
        } else if (s === 'd') {
            answer += 10;
        } else {
            answer -= 10;
        }
    }
    
    return answer;
}
