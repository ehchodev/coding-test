import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (list.size() == 0) {
                list.add(arr[i++]);
            } else {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.add(arr[i++]);
                } else {
                    list.remove(list.size() - 1);
                }
            }
        }
        
        stk = new int[list.size()];
        for (int j=0; j<list.size(); j++) {
            stk[j] = list.get(j);
        }
        
        return stk;
    }
}
