class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int cnt = n / a * b;
            n = cnt + (n % a);
            answer += cnt;
        }
        
        return answer;
    }
}
