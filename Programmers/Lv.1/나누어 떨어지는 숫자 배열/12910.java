import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (n % divisor == 0) {
                list.add(n);
            }
        }
        
        int size = list.size();
        if (size > 0) {
            answer = new int[size];
            for (int i=0; i<size; i++) {
                answer[i] = list.get(i);
            }
            
            Arrays.sort(answer);
        } else {
            answer = new int[] { -1 };
        }
        
        return answer;
    }
}
