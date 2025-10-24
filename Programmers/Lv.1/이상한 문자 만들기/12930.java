import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        boolean upperFlag = true;
        
        for (int i=0; i<str.length; i++) {
            if (upperFlag && !" ".equals(str[i])) {
                str[i] = str[i].toUpperCase();
                upperFlag = false;
            } else {
                str[i] = str[i].toLowerCase();
                upperFlag = true;
            }
        }
        
        answer = String.join("", str);
        
        return answer;
    }
}
