class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        
        for (int num : arr) {
            answer = lcm(answer, num);
        }
        
        return answer;
    }
    
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
    
    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
