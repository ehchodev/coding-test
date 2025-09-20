import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);
        
        for (int i=0; i<query.length; i++) {
            int s = (i % 2 == 0) ? query[i]+1 : 0;
            int e = (i % 2 == 0) ? list.size() : Math.min(list.size(), query[i]);
            for (int j=e-1; j>=s; j--) list.remove(j);
        }
        
        answer = new int[list.size()];
        for (int k=0; k<list.size(); k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}
