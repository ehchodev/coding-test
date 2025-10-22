function solution(s){
    let answer = true;
    
    let pCnt = 0, yCnt = 0;
    s.split('').forEach(v => {
       if (v.toUpperCase() === 'P') {
           pCnt++;
       } else if (v.toUpperCase() === 'Y') {
           yCnt++;
       }
    });
    
    answer = (pCnt === yCnt);

    return answer;
}
