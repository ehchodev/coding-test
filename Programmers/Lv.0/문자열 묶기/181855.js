function solution(strArr) {
    let answer = 0;
    
    const lengthArr = new Array(30).fill(0);
    strArr.forEach(v => {
        lengthArr[v.length - 1]++;
    });
    
    answer = Math.max(...lengthArr);
    
    return answer;
}
