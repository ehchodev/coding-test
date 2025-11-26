function solution(X, Y) {
    let answer = '';
    
    const xArr = X.split('').sort((a, b) => b - a);
    const yArr = Y.split('').sort((a, b) => b - a);
    
    let xIndex = 0, yIndex = 0;
    while (xIndex < xArr.length && yIndex < yArr.length) {
        if (xArr[xIndex] === yArr[yIndex]) {
            answer += xArr[xIndex];
            xIndex++;
            yIndex++;
        } else if (xArr[xIndex] > yArr[yIndex]) {
            xIndex++;
        } else {
            yIndex++;
        }
    }
    
    if (answer === '') {
        answer = '-1';
    } else if (answer.charAt(0) === '0') {
        answer = '0';
    }
    
    return answer;
}
