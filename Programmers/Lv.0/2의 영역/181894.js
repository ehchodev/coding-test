function solution(arr) {
    const answer = [];
    
    const s = arr.indexOf(2);
    const e = arr.lastIndexOf(2);
    
    if (s === -1) answer.push(-1);
    else arr.slice(s, e + 1).forEach(v => answer.push(v));
    
    return answer;
}
