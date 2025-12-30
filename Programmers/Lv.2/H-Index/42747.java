import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        for (int i = citations.length - 1; i >= 0; i--) {
            int h = citations[i];
            int count = citations.length - i;
            if (h >= count) {
                answer = count;
            }
        }
        
        return answer;
    }
}
