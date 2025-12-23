import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < want.length; i++) {
            for (int j = 1; j <= number[i]; j++) {
                list.add(want[i]);
            }
        }
        
        for (int i = 0; i <= discount.length - 10; i++) {
            List<String> list2 = new ArrayList<>(list);
            for (int j = i; j < i + 10; j++) {
                if (list2.contains(discount[j])) {
                    list2.remove(list2.indexOf(discount[j]));
                    
                    if (list2.size() == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}
