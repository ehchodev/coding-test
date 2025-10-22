function solution(s) {
    let answer = '';
    
    const m = s.length / 2 + 1;
    if (s.length % 2 === 0) {
        answer = s.slice(m - 2, m);
    } else {
        answer = s.slice(m - 1, m);
    }
    
    return answer;
}
