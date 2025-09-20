import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        int s = 0, e = 0;
        for (int i=0; i<str_list.length; i++) {
            if ("l".equals(str_list[i])) {
                s = 0;
                e = i;
                break;
            } else if ("r".equals(str_list[i])) {
                s = i + 1;
                e = str_list.length;
                break;
            }
        }
        
        answer = Arrays.copyOfRange(str_list, s, e);
        
        return answer;
    }
}
