import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        int[] arr = new int[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            arr[i] = elements[i];
            arr[elements.length + i] = elements[i];
        }
        
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < elements.length; j++) {
            int sum = 0;
            for (int cnt = 0; cnt < elements.length; cnt++) {
                sum += arr[j + cnt];
                set.add(sum);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}
