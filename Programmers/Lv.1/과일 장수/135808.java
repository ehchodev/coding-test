import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        int l = score.length;
        while (l >= m) {
            int e = l - 1;
            int s = e - m + 1;
            
            answer += score[s] * m;
            
            l -= m;
        }
        
        return answer;
    }
}
