function solution(num, total) {
    const answer = [];
    
    let sum = -1;
    let start = 1;
    while (sum !== total) {
        sum = 0;
        
        for (let i=start; i<start+num; i++) {
            sum += i;
            answer[i-start] = i;
        }
        
        if (sum > total) start -= 1;
        if (sum < total) start += 1;
    }
    
    return answer;
}
