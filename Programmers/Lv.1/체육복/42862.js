function solution(n, lost, reserve) {
    let answer = 0;
    
    const arr = new Array(n).fill(0);
    for (const l of lost) arr[l - 1]--;
    for (const r of reserve) arr[r - 1]++;
    
    for (let i = 0; i < n; i++) {
        if (arr[i] === -1) {
            if (i > 0 && arr[i - 1] === 1) {
                arr[i]++;
                arr[i - 1]--;
            } else if (i < n - 1 && arr[i + 1] === 1) {
                arr[i]++;
                arr[i + 1]--;
            }
        }
        
        if (arr[i] > -1) answer++;
    }
    
    return answer;
}
