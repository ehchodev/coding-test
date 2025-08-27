function solution(score) {
    const answer = [];
    
    const sum = [];
    score.forEach(s => {
       sum.push(s[0] + s[1]); 
    });
    
    sum.forEach(v1 => {
       answer.push(sum.filter(v2 => v1 < v2).length + 1);
    });
    
    return answer;
}
