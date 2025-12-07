import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] t = term.split(" ");
            termsMap.put(t[0], Integer.parseInt(t[1]));
        }
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String pdate = privacy[0];
            int pterm = termsMap.get(privacy[1]);
            
            int pyy = Integer.parseInt(pdate.substring(0, 4));
            int pmm = Integer.parseInt(pdate.substring(5, 7)) + pterm;
            int pdd = Integer.parseInt(pdate.substring(8)) - 1;
            
            if (pdd == 0) {
                pmm -= 1;
                pdd = 28;
            }
            
            if (pmm > 12) {
                pyy += pmm / 12;
                pmm %= 12;
                
                if (pmm == 0) {
                    pyy -= 1;
                    pmm = 12;
                }
            }
            
            int yy = Integer.parseInt(today.substring(0, 4));
            int mm = Integer.parseInt(today.substring(5, 7));
            int dd = Integer.parseInt(today.substring(8));
            
            if (yy > pyy || (yy == pyy && mm > pmm) || (yy == pyy && mm == pmm && dd > pdd)) {
                list.add(i + 1);
            }
        }
        
        answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}
