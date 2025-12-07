import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, List<String>> reportMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String id : id_list) {
            List<String> list = new ArrayList<>();
            reportMap.put(id, list);
            countMap.put(id, 0);
        }
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Iterator<String> iter = reportSet.iterator();
        while (iter.hasNext()) {
            String[] next = iter.next().split(" ");
            reportMap.get(next[0]).add(next[1]);
            countMap.put(next[1], countMap.get(next[1]) + 1);
        }
        
        for (int i = 0; i < id_list.length; i++) {
            for (String key : countMap.keySet()) {
                if (countMap.get(key) >= k && reportMap.get(id_list[i]).contains(key)) {
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}
