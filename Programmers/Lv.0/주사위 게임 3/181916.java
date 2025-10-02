import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(a, 1);
        map.put(b, map.getOrDefault(b, 0) + 1);
        map.put(c, map.getOrDefault(c, 0) + 1);
        map.put(d, map.getOrDefault(d, 0) + 1);

        int size = map.size();
        if (size == 1) {
            answer = 1111 * a;
        } else if (size == 2) {
            if (map.get(a) == 1) {
                answer = (int) Math.pow(10 * b + a, 2);
            } else if (map.get(b) == 1) {
                answer = (int) Math.pow(10 * a + b, 2);
            } else if (map.get(c) == 1) {
                answer = (int) Math.pow(10 * a + c, 2);
            } else if (map.get(d) == 1) {
                answer = (int) Math.pow(10 * a + d, 2);
            } else {
                if (a == b) {
                    answer = (a + c) * Math.abs(a - c);
                } else {
                    answer = (a + b) * Math.abs(a - b);
                }
            }
        } else if (size == 3) {
            if (a == b) {
                answer = c * d;
            } else if (a == c) {
                answer = b * d;
            } else if (a == d) {
                answer = b * c;
            } else if (b == c) {
                answer = a * d;
            } else if (b == d) {
                answer = a * c;
            } else {
                answer = a * b;
            }
        } else {
            answer = Math.min(a, Math.min(b, Math.min(c, d)));
        }
        
        return answer;
    }
}
