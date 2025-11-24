function solution(N, stages) {
    const answer = [];
    
    const arr = [];
    for (let i = 1; i <= N; i++) {
        let tryCount = 0;
        let failCount = 0;
        stages.forEach(v => {
            if (v >= i) tryCount++;
            if (v == i) failCount++;
        });
        
        arr.push([i, failCount / tryCount]);
    }
    
    arr.sort((a, b) => b[1] - a[1]).forEach(v => answer.push(v[0]));
    
    return answer;
}
