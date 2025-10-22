class Solution {
    public String solution(String s) {
        String answer = "";
        
        int m = s.length() / 2 + 1;
        if (s.length() % 2 == 0) {
            answer = s.substring(m - 2, m);
        } else {
            answer = s.substring(m - 1, m);
        }
        
        return answer;
    }
}
