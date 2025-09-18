import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        for (String s : myString.split("x")) {
            if (!"".equals(s)) list.add(s);
        }
        
        answer = new String[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
