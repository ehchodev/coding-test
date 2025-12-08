function solution(s) {
    let answer = '';
    
    const strArr = s.split(' ').sort((a, b) => a - b);
    
    answer = strArr[0] + ' ' + strArr[strArr.length - 1];
    
    return answer;
}
