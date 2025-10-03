function solution(a, d, included) {
    let answer = 0;
    
    for (const i of included) {
        if (i) answer += a;
        a += d;
    }
    
    return answer;
}
