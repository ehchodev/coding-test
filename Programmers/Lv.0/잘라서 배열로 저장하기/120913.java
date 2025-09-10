class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[( (my_str.length()-1) / n ) + 1];
        
        int idx = 0;
        while (my_str.length() > 0) {
            if (my_str.length() >= n) {
                answer[idx] = my_str.substring(0, n);
                my_str = my_str.substring(n, my_str.length());
            } else {
                answer[idx] = my_str.substring(0, my_str.length());
                my_str = "";
            }
            
            idx++;
        }
        
        return answer;
    }
}
