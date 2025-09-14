import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        
        Map<Integer, Integer> idxMap = new HashMap<Integer, Integer>();
        int cnt = 0;
        
        for (int i=0; i<rank.length; i++) {
            if (attendance[i]) {
                idxMap.put(rank[i], i);
                cnt++;
            } else {
                rank[i] = 999;
            }
        }
        
        Arrays.sort(rank);
        
        int a = idxMap.get(rank[0]);
        int b = idxMap.get(rank[1]);
        int c = idxMap.get(rank[2]);
        
        answer = (10000 * a) + (100 * b) + c;
        
        return answer;
    }
}
