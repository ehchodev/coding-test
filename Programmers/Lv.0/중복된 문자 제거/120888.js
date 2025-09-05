function solution(my_string) {
    let answer = '';
    
    [...my_string].forEach(v => {
       if (answer.indexOf(v) < 0) answer += v; 
    });
    
    return answer;
}
