function solution(array) {
    let answer = 0;
    let maxCnt = 0;
    
    const map = new Map();
    array.forEach(num => {
        const cnt = (map.get(num) || 0) + 1;
        
        if (cnt > maxCnt) {
            answer = num;
            maxCnt = cnt;
        } else if (cnt === maxCnt) {
            answer = -1;
        }
        
        map.set(num, cnt);
    });
    
    return answer;
}
