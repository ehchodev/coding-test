class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        // 계산
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = denom1 * denom2;
        
        // 최대공약수
        int gcd = getGCD(answer[0], answer[1]);
        
        // 약분
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
    
    // 최대공약수 구하기
    private int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1 % num2);
    }
}
