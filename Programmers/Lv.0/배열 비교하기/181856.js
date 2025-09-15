function solution(arr1, arr2) {
    let answer = 0;
    
    if (arr1.length > arr2.length) {
        answer = 1;
    } else if (arr1.length < arr2.length) {
        answer = -1;
    } else {
        const sum1 = arr1.reduce((a1, b1) => a1 + b1, 0);
        const sum2 = arr2.reduce((a2, b2) => a2 + b2, 0);
        if (sum1 > sum2) {
            answer = 1;
        } else if (sum1 < sum2) {
            answer = -1;
        } else {
            answer = 0;
        }
    }
    
    return answer;
}
