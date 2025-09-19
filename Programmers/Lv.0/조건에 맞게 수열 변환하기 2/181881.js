function solution(arr) {
    let answer = -1;
    
    let arr2 = [];
    while (!arr.every((v, i) => v === arr2[i])) {
        answer++;
        arr2 = [...arr];
        
        for (let i=0; i<arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 === 0) {
                arr[i] /= 2;
            } else if (arr[i] < 50 && arr[i] % 2 !== 0) {
                arr[i] *= 2;
                arr[i]++;
            }
        }
    }
    
    return answer;
}
