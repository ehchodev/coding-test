class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int num1 = Math.min(a, b);
        int num2 = Math.max(a, b);
        for (int i=num1; i<=num2; i++) {
            answer += i;
        }
        
        return answer;
    }
}
