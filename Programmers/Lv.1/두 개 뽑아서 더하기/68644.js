function solution(numbers) {
    const answer = [];
    
    const set = new Set();
    for (let i=0; i<numbers.length-1; i++) {
        for (let j=i+1; j<numbers.length; j++) {
            set.add(numbers[i] + numbers[j]);
        }
    }
    
    for (const item of set.values()) {
        answer.push(item);
    }
    
    answer.sort((a, b) => a - b);
    
    return answer;
}
