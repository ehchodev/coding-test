class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[][] board2 = new int[board.length][board[0].length];
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (board[i][j] == 1) {
                    board2[i][j] = -1;
                    if (i - 1 >= 0) {
                        board2[i-1][j] = -1;
                        if (j - 1 >= 0) board2[i-1][j-1] = -1;
                        if (j + 1 < board[0].length) board2[i-1][j+1] = -1;
                    }
                    if (j - 1 >= 0) {
                        board2[i][j-1] = -1;
                        if (i - 1 >= 0) board2[i-1][j-1] = -1;
                        if (i + 1 < board.length) board2[i+1][j-1] = -1;
                    }
                    if (i + 1 < board.length) {
                        board2[i+1][j] = -1;
                        if (j - 1 >= 0) board2[i+1][j-1] = -1;
                        if (j + 1 < board[0].length) board2[i+1][j+1] = -1;
                    }
                    if (j + 1< board[0].length) {
                        board2[i][j+1] = -1;
                        if (i - 1 >= 0) board2[i-1][j+1] = -1;
                        if (i + 1 < board.length) board2[i+1][j+1] = -1;
                    }
                }
            }
        }
        
        for (int a=0; a<board.length; a++) {
            for (int b=0; b<board[0].length; b++) {
                if (board2[a][b] == 0) answer++;
            }
        }
        
        return answer;
    }
}
