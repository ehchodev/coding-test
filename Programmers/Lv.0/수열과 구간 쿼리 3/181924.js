function solution(arr, queries) {
    const answer = arr;
    
    for (const [a, b] of queries) {
        const t = answer[a];
        answer[a] = answer[b];
        answer[b] = t;
    }
    
    return answer;
}
