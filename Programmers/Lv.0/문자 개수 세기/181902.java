class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for (int i=0; i<my_string.length(); i++) {
            int n = (int) my_string.charAt(i) - 65;
            answer[(n > 25) ? (n - 6) : n]++;
        }
        
        return answer;
    }
}
