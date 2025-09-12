function solution(arr) {
    const rownum = arr.length;
    const colnum = arr[0].length;
    const num = Math.max(rownum, colnum);
    
    const answer = new Array(num);
    for (let n=0; n<num; n++) answer[n] = new Array(num).fill(0);
    
    for (let i=0; i<arr.length; i++) {
        for (let j=0; j<arr[i].length; j++) {
            answer[i][j] = arr[i][j];
        }
    }
    
    return answer;
}
