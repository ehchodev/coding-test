class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if (a != b && b != c) {
            answer = a + b + c;
        } else if (a != b || b != c) {
            answer = (a + b + c) * (a * a + b * b + c * c);
        } else {
            answer = (a * 3) * ((int) Math.pow(a, 2) * 3) * ((int) Math.pow(a, 3) * 3);
        }
        
        return answer;
    }
}
