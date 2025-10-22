class Solution {
    public long solution(long n) {
        long answer = -1;
        
        double num1 = Math.sqrt(n);
        long num2 = (long) num1;
        
        if (num1 == num2) {
            answer = (num2 + 1) * (num2 + 1);
        }
        
        return answer;
    }
}
