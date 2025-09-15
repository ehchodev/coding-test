import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int p = 1;
        while (p < arr.length) p *= 2;
        
        answer = Arrays.copyOf(arr, p);
        
        return answer;
    }
}
