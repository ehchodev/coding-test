import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<Integer>();
        
        int num = 2;
        while (n > 1) {
            if (n % num == 0) {
                set.add(num);
                n /= num;
            } else {
                num++;
            }
        }
        
        int[] answer = new int[set.size()];
        int index = 0;
        for (int s : set) {
            answer[index] = s;
            index++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
