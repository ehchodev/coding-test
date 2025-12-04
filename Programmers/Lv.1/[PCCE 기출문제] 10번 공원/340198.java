import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        
        int[][] arr = new int[park.length][park[0].length];
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length; j++) {
                if ("-1".equals(park[i][j])) {
                    arr[i][j] = 1;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>();
        for (int x = 1; x < arr.length; x++) {
            for (int y = 1; y < arr[x].length; y++) {
                if (arr[x][y] == 1) {
                    arr[x][y] = Math.min(arr[x - 1][y], Math.min(arr[x][y - 1], arr[x - 1][y - 1])) + 1;
                    list.add(arr[x][y]);
                }
            }
        }
        
        for (int m : mats) {
            if (list.contains(m)) {
                answer = Math.max(answer, m);
            }
        }
        
        return answer;
    }
}
