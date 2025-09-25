class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] str = my_string.split("");
        for (int i=0; i<=(e-s)/2; i++) {
            String temp = str[s + i];
            str[s + i] = str[e - i];
            str[e - i] = temp;
        }
        
        answer = String.join("", str);
        
        return answer;
    }
}
