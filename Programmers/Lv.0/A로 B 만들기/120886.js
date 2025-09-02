function solution(before, after) {
    let answer = 0;
    
    const bfarr = [...before].sort().join('');
    const afarr = [...after].sort().join('');
    
    if (bfarr === afarr) answer = 1;
    
    return answer;
}
