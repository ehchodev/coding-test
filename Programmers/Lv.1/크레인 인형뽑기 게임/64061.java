import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for (int m : moves) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][m - 1] != 0) {
                    list.add(board[i][m - 1]);
                    board[i][m - 1] = 0;
                    
                    int size = list.size();
                    if (size >= 2 && list.get(size - 1) == list.get(size - 2)) {
                        answer += 2;
                        
                        list.remove(size - 1);
                        list.remove(size - 2);
                    }
                    
                    break;
                }
            }
        }
        
        return answer;
    }
}
