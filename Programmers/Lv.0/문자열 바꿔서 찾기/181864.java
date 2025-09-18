class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String str = "";
        for (String s : myString.split("")) {
            if ("A".equals(s)) str += "B";
            else str += "A";
        }
        
        answer = (str.contains(pat)) ? 1 : 0;
        
        return answer;
    }
}
