class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (n < factorial(i)) break;
            answer = i;
        }
        
        return answer;
    }
    
    int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial(num - 1);
    }
}
