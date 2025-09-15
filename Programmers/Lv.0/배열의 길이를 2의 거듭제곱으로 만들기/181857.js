function solution(arr) {
    const answer = [...arr];
    
    let p = 1;
    while (p < arr.length) p *= 2;
    
    while (answer.length < p) answer.push(0);
    
    return answer;
}
