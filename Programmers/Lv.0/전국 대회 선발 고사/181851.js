function solution(rank, attendance) {
    let answer = 0;
    
    const arr = [];
    for (let i=0; i<rank.length; i++) {
        if (attendance[i]) {
            arr.push([rank[i], i]);
        }
    }
    
    arr.sort((a, b) => a[0] - b[0]);
    
    const a = arr[0][1];
    const b = arr[1][1];
    const c = arr[2][1];
    
    answer = (10000 * a) + (100 * b) + c;
    
    return answer;
}
