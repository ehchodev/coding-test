class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        for (int i=myString.length(); i>=0; i--) {
            String s = myString.substring(0, i);
            if (s.endsWith(pat)) {
                answer = s;
                break;
            }
        }
        
        return answer;
    }
}
