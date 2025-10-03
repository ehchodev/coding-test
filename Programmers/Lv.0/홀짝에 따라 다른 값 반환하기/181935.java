class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int s = (n % 2 == 1) ? 1 : 2;
        for (int i=s; i<=n; i+=2) {
            answer += (n % 2 == 1 ) ? i : (i * i);
        }
        
        return answer;
    }
}
