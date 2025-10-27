import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i=0; i<commands.length; i++) {
            int s = commands[i][0];
            int e = commands[i][1];
            int idx = commands[i][2];
            
            int[] arr = Arrays.copyOfRange(array, s - 1, e);
            Arrays.sort(arr);
            
            answer[i] = arr[idx - 1];
        }
        
        return answer;
    }
}
