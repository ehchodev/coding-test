import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for (int i=l; i<=r; i++) {
            String s = String.valueOf(i);
            if ("".equals(s.replaceAll("5", "").replaceAll("0", ""))) {
                list.add(i);
            }
        }
        
        if (list.size() == 0) {
            answer = new int[] {-1};
        } else {
            answer = new int[list.size()];
            for (int j=0; j<list.size(); j++) {
                answer[j] = list.get(j);
            }
        }
        
        return answer;
    }
}
