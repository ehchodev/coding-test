import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Comparator.reverseOrder());
        
        answer = Long.parseLong(String.join("", str));
        
        return answer;
    }
}
