function solution(dots) {
    let answer = 0;
    
    const s1 = (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
    const s2 = (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);
    if (s1 === s2) return 1;
    
    const s3 = (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
    const s4 = (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);
    if (s3 === s4) return 1;
    
    const s5 = (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
    const s6 = (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);
    if (s5 === s6) return 1;
    
    return answer;
}
