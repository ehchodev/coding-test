import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        while (num <= n) {
            int x = (num - 1) / w;
            int position = (num - 1) % w;
            int y = (x % 2 == 0) ? position : w - position - 1;
        
            if (x % 2 == 0) {
                num = num + (w - y) + (w - y - 1);
            } else {
                num = num + y + y + 1;
            }
            
            answer++;
        }
        
        return answer;
    }
}
