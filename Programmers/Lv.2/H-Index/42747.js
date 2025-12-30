function solution(citations) {
    let answer = 0;
    
    citations.sort((a, b) => a - b);
    
    for (let i = 0; i < citations.length; i++) {
        const h = citations[i];
        const count = citations.length - i;
        if (h >= count) {
            answer = count;
            break;
        }
    }
    
    return answer;
}
