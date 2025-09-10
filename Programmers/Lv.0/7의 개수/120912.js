function solution(array) {
    let answer = 0;
    
    array.forEach(v => {
        while (v > 0) {
            if (v % 10 === 7) answer++;
            v = parseInt(v / 10);
        }
    });
    
    return answer;
}
