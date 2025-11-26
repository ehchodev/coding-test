function solution(lottos, win_nums) {
    const answer = [7, 7];
    
    lottos.forEach(v => {
        if (win_nums.includes(v)) {
            answer[0]--;
            answer[1]--;
        }
        if (v === 0) answer[0]--;
    });
    
    if (answer[0] > 6) answer[0] = 6;
    if (answer[1] > 6) answer[1] = 6;
    
    return answer;
}
