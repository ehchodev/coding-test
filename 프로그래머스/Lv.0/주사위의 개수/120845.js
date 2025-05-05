function solution(box, n) {
    let answer = 1;
    
    box.forEach(v => {
       answer *= parseInt(v / n); 
    });
    
    return answer;
}
