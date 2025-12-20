import java.util.*;

class Solution {
    public long solution(int n) {
        long answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i <= 3) {
                list.add(i);
            } else {
                list.add( (list.get(i - 3) + list.get(i - 2)) % 1234567 );
            }
        }
        
        answer = list.get(list.size() - 1);
        
        return answer;
    }
}
