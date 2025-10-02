function solution(arr, queries) {
    const answer = [];
    
    for (const [s, e, k] of queries) {
        let num = -1;
        for (let i=s; i<=e; i++) {
            if (arr[i] > k && (num === -1 || num > arr[i])) {
                num = arr[i];
            }
        }
        
        answer.push(num);
    }
    
    return answer;
}
