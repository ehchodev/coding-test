function solution(keyinput, board) {
    const answer = [0, 0];
    
    keyinput.forEach(v => {
       if (v === "up") {
           if (answer[1] >= (board[1]-1) / 2) return;
           answer[1]++;
       } else if (v === "down") {
           if (answer[1] <= (board[1]-1) / 2 * -1) return;
           answer[1]--;
       } else if (v === "left") {
           if (answer[0] <= (board[0]-1) / 2 * -1) return;
           answer[0]--;
       } else if (v === "right") {
           if (answer[0] >= (board[0]-1) / 2) return;
           answer[0]++;
       }
    });
    
    return answer;
}
