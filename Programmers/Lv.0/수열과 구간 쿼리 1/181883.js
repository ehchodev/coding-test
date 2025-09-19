function solution(arr, queries) {
    const answer = arr;
    
    for (let [a, b] of queries) {
        for (let i=a; i<=b; i++) arr[i]++;
    }
    
    return answer;
}
