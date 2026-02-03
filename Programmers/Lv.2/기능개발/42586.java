import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        
        while (i < progresses.length) {
            int addDays = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            
            for (int j = i; j < progresses.length; j++) {
                progresses[j] += (speeds[j] * addDays);
            }
            
            int deployCnt = 0;
            for (int k = i; k < progresses.length; k++) {
                if (progresses[k] < 100) break;
                deployCnt++;
            }
            list.add(deployCnt);
            
            i += deployCnt;
        }
        
        answer = new int[list.size()];
        for (int n = 0; n < list.size(); n++) {
            answer[n] = list.get(n);
        }
        
        return answer;
    }
}
