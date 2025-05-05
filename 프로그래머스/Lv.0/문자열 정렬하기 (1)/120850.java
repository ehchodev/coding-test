import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        
        String num = "";
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) {
                num += c;
            }
        }
        
        answer = new int[num.length()];
        for (int i=0; i<num.length(); i++) {
            answer[i] = Integer.parseInt(num.split("")[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
