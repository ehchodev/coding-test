function solution(A, B) {
    let answer = -1;
    
    const l = A.length;
    let cnt = 0;
    for (let i=0; i<l; i++) {
        if (A === B) {
            answer = cnt;
            break;
        }
        
        A = A.substr(l-1, l) + A.substr(0, l-1);
        cnt++;
    }
    
    return answer;
}
