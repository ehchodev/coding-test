function solution(k, score) {
    const answer = [];
    
    const arr = [];
    for (let i=0; i<score.length; i++) {
        if (i < k) {
            arr.push(score[i]);
        } else {
            if (score[i] > arr[0]) {
                arr[0] = score[i];
            }
        }
        
        arr.sort((a, b) => a - b);
        answer.push(arr[0]);
    }
    
    return answer;
}
