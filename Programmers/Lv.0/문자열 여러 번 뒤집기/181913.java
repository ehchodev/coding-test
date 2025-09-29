class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        String[] str = my_string.split("");
        for (int[] query : queries) {
            int s = query[0];
            int e = query [1];
            for (int i=0; i<=(e-s)/2; i++) {
                String t = str[s + i];
                str[s + i] = str[e - i];
                str[e - i] = t;
            }
        }
        
        answer = String.join("", str);
        
        return answer;
    }
}
