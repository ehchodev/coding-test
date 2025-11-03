function solution(n, arr1, arr2) {
    const answer = [];
    
    for (let i=0; i<n; i++) {
        const arr = new Array(n).fill(" ");
        
        for (let j=n-1; j>=0; j--) {
            const num = Math.pow(2, j);
            if (arr1[i] >= num) {
                arr[n - j - 1] = "#";
                arr1[i] -= num;
            }
            
            if (arr2[i] >= num) {
                arr[n - j - 1] = "#";
                arr2[i] -= num;
            }
        }
        
        answer.push(arr.join(""));
    }
    
    return answer;
}
