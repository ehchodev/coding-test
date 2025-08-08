import java.util.*;

class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        for (int i=0; i<rsp.length(); i++) {
            String s = rsp.split("")[i];
            if (s.equals("0")) answer += "5";
            if (s.equals("2")) answer += "0";
            if (s.equals("5")) answer += "2";
        }
        
        return answer;
    }
}
