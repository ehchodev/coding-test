import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for (int i=d.length; i>=1; i--) {
            int sum = 0;
            for (int j=0; j<i; j++) {
                sum += d[j];
            }
            
            if (sum <= budget) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
