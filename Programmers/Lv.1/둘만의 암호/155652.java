class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (String delStr : skip.split("")) {
            alphabets = alphabets.replaceAll(delStr, "");
        }
        
        for (String str : s.split("")) {
            int strIndex = alphabets.indexOf(str) + index;
            answer += alphabets.charAt(strIndex % alphabets.length());
        }
        
        return answer;
    }
}
