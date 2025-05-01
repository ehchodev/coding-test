import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--.."
        };
        
        int index = 0;
        String[] letters = letter.split(" ");
        
        for (int i=0; i<morse.length; i++) {
            if (letters[index].equals(morse[i])) {
                answer += (char) ('a' + i);
                index++;
                i = -1;
            }
            
            if (index == letters.length) break;
        }
        
        return answer;
    }
}
