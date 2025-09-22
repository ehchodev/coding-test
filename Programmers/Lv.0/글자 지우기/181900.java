class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        String[] str = my_string.split("");
        for (int num : indices) {
            str[num] = "";
        }
        
        answer = String.join("", str);
        
        return answer;
    }
}
