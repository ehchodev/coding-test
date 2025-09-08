function solution(s) {
    let answer = '';
    
    const arr = [...s].sort();
    for (let i=0; i<arr.length-1; i++) {
        const str = arr[i];
        for (let j=i+1; j<arr.length; j++) {
            if (str === arr[j]) {
                arr[i] = '';
                arr[j] = '';
            }
        }
    }
    
    answer = arr.join('');
    
    return answer;
}
