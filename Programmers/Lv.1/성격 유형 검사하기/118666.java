import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        String[] arr = {"R", "T", "C", "F", "J", "M", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for (String a : arr) map.put(a, 0);
        
        for (int i = 0; i < survey.length; i++) {
            String[] s = survey[i].split("");
            int c = choices[i];
            
            if (c > 4) {
                map.put(s[1], map.get(s[1]) + (c - 4));
            } else {
                map.put(s[0], map.get(s[0]) + (4 - c));
            }
        }
        
        answer += (map.get("R") >= map.get("T")) ? "R" : "T";
        answer += (map.get("C") >= map.get("F")) ? "C" : "F";
        answer += (map.get("J") >= map.get("M")) ? "J" : "M";
        answer += (map.get("A") >= map.get("N")) ? "A" : "N";
        
        return answer;
    }
}
