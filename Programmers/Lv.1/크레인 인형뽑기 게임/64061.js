function solution(board, moves) {
    let answer = 0;
    
    const list = [];
    
    moves.forEach(m => {
       for (let i = 0; i < board.length; i++) {
           if (board[i][m - 1] !== 0) {
               list.push(board[i][m - 1]);
               board[i][m - 1] = 0;
               
               const l = list.length;
               if (l >= 2 && list[l - 1] === list[l - 2]) {
                   answer += 2;
                   
                   list.pop(l - 1);
                   list.pop(l - 2);
               }
               
               break;
           }
       } 
    });
    
    return answer;
}
