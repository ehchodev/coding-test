function solution(s) {
    let answer = '';
    
    let firstFlag = true;
    s.split('').forEach(v => {
       if (v === ' ') {
           answer += v;
       } else if (!isNaN(v)) {
           answer += v;
       } else if (firstFlag) {
           answer += v.toUpperCase();
       } else {
           answer += v.toLowerCase();
       }
        
        firstFlag = (v === ' ');
    });
    
    return answer;
}
