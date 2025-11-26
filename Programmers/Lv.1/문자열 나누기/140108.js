function solution(s) {
    let answer = 1;
    
    let xCount = 0, noxCount = 0;
    let str = s.charAt(0);
    for (let i = 0; i < s.length - 1; i++) {
        if (s.charAt(i) === str) {
            xCount++;
        } else {
            noxCount++;
        }
        
        if (xCount === noxCount) {
            answer++;
            xCount = 0, noxCount = 0;
            str = s.charAt(i + 1);
        }
    }
    
    return answer;
}
