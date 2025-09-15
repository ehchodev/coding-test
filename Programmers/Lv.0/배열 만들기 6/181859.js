function solution(arr) {
    const answer = [];
    
    let i = 0;
    while (i < arr.length) {
        if (answer.length > 0 && answer[answer.length - 1] === arr[i]) {
            answer.splice(-1);
        } else {
            answer.push(arr[i]);
        }
        
        i++;
    }
    
    if (answer.length === 0) {
        answer.push(-1);
    }
    
    return answer;
}
