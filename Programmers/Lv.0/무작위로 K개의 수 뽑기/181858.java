import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Set<Integer> set = new LinkedHashSet<Integer>();
        for (int num : arr) {
            set.add(num);
        }
        
        Iterator<Integer> iter = set.iterator();
        for (int i=0; i<k; i++) {
            int n = -1;
            if (iter.hasNext()) n = iter.next();
            
            answer[i] = n;
        }
        
        return answer;
    }
}
