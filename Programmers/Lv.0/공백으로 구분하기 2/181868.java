import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        for (String s : my_string.split(" ")) {
            if (!"".equals(s)) list.add(s);
        }
        
        answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
