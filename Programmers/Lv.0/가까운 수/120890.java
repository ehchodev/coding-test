import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int answer = array[0];
        int mindiff = Math.abs(answer - n);
        
        for (int i=1; i<array.length; i++) {
            int diff = Math.abs(array[i] - n);
            if (diff < mindiff) {
                answer = array[i];
                mindiff = diff;
            }
        }
        
        return answer;
    }
}
