function solution(s) {
    const answer = [];
    
    for (let i=0; i<s.length; i++) {
        let num = -1;
        for (let j=0; j<i; j++) {
            if (s.charAt(i) === s.charAt(j)) {
                num = i - j;
            }
        }
        
        answer[i] = num;
    }
    
    return answer;
}
