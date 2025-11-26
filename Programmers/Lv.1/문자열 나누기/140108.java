class Solution {
    public int solution(String s) {
        int answer = 1;
        
        int xCount = 0;
        int noxCount = 0;
        char str = s.charAt(0);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == str) {
                xCount++;
            } else {
                noxCount++;
            }
            
            if (xCount == noxCount) {
                answer++;
                xCount = 0;
                noxCount = 0;
                str = s.charAt(i + 1);
            }
        }
        
        return answer;
    }
}
