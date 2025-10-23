function solution(arr) {
    const answer = (arr.length > 1) ? arr : [ -1 ];
    
    const min = Math.min(...arr);
    arr.splice(arr.indexOf(min), 1);
    
    return answer;
}
