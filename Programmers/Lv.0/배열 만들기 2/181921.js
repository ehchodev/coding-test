function solution(l, r) {
    const answer = [];
    
    for (let i=l; i<=r; i++) {
        if (i.toString().replaceAll('5', '').replaceAll('0', '') === '') {
            answer.push(i);
        }
    }
    
    if (answer.isEmpty()) {
        answer.push(-1);
    }
    
    return answer;
}
