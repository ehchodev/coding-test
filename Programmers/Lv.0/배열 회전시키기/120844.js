function solution(numbers, direction) {
    const answer = [];
    
    if (direction === 'right') {
        answer.push(numbers[numbers.length - 1]);
        
        for (let i=0; i<numbers.length - 1; i++) {
            answer[i + 1] = numbers[i];
        }
        
    } else {
        answer[numbers.length - 1] = numbers[0];
        
        for (let i=0; i<numbers.length - 1; i++) {
            answer[i] = numbers[i + 1];
        }
    }
    
    return answer;
}
