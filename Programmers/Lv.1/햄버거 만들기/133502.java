import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        List<Integer> recipe = Arrays.asList(1, 2, 3, 1);
        List<Integer> list = new ArrayList<>();
        for (int i : ingredient) list.add(i);
        
        for (int j = 0; j < list.size() - 3; j++) {
            if (list.size() < 4) break;
            
            if (recipe.equals(list.subList(j, j + 4))) {
                list.subList(j, j + 4).clear();
                answer++;
                j = Math.max(-1, j - 4);
            }
        }
        
        return answer;
    }
}
