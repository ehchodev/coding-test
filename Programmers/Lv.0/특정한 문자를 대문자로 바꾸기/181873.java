class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        String[] strArr = my_string.split("");
        for (int i=0; i<my_string.length(); i++) {
            if (strArr[i].equals(alp)) {
                strArr[i] = strArr[i].toUpperCase();
            }
        }
        
        answer = String.join("", strArr);
        
        return answer;
    }
}
