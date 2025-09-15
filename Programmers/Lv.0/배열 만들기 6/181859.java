import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        List<Integer> stkList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (!stkList.isEmpty() && stkList.get(stkList.size() - 1) == arr[i]) {
                stkList.remove(stkList.size() - 1);
            } else {
                stkList.add(arr[i]);
            }
            
            i++;
        }
        
        if (stkList.isEmpty()) {
            answer = new int[] {-1};
        } else {
            answer = new int[stkList.size()];
            for (int j=0; j<stkList.size(); j++) {
                answer[j] = stkList.get(j);
            }
        }
        
        return answer;
    }
}
