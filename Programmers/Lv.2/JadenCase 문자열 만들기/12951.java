class Solution {
    public String solution(String s) {
        String answer = "";
        
        boolean firstFlag = true;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                answer += c;
            } else if (Character.isDigit(c)) {
                answer += c;
            } else if (firstFlag) {
                answer += (c + "").toUpperCase();
            } else {
                answer += (c + "").toLowerCase();
            }
            
            firstFlag = (c == ' ');
        }
        
        return answer;
    }
}
