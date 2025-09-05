function solution(array, n) {
    let answer = array.sort((a, b) => a - b)[0];
    let mindiff = Math.abs(answer - n);
    
    for (let i=1; i<array.length; i++) {
        const diff = Math.abs(array[i] - n);
        if (diff < mindiff) {
            answer = array[i];
            mindiff = diff;
        }
    }
    
    return answer;
}
