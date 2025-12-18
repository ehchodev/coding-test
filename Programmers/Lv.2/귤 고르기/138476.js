function solution(k, tangerine) {
    let answer = 0;
    
    const map = new Map();
    tangerine.forEach(v => {
       map.set(v, (map.get(v) || 0) + 1); 
    });
    
    const arr = Array.from(map.values()).sort((a, b) => b - a);
    
    let sum = 0;
    for (const count of arr) {
        sum += count;
        answer++;
        if (sum >= k) break;
    }
    
    return answer;
}
