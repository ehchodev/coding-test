import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i <= n; i++) {
            if (i <= 1) list.add(i);
            else list.add( (list.get(i - 1) + list.get(i - 2)) % 1234567 );
        }
        
        answer = (list.get(n - 1) + list.get(n - 2)) % 1234567;
        
        return answer;
    }
}
