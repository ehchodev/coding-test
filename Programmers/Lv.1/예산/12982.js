function solution(d, budget) {
    let answer = 0;
    
    d.sort((a, b) => a - b);
    
    for (let i=d.length; i>=1; i--) {
        let sum = 0;
        for (let j=0; j<i; j++) {
            sum += d[j];
        }
        
        if (sum <= budget) {
            answer = i;
            break;
        }
    }
    
    return answer;
}
