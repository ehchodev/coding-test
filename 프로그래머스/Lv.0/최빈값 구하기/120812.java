import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int maxKey = -1;
        int maxValue = -1;
        boolean multiFlag = false;
        for (int key : map.keySet()) {
            int value = map.get(key);
            
            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
                multiFlag = false;
            } else if (value == maxValue) {
                multiFlag = true;
            }
        }
        
        if (multiFlag) {
            answer = -1;
        } else {
            answer = maxKey;
        }
        
        return answer;
    }
}
