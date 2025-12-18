class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int sum = brown + yellow;
        for (int i = sum; i > 2; i--) {
            if (sum % i == 0) {
                int num1 = i;
                int num2 = sum / i;
                
                if (num1 > 2 && num2 > 2 && (num1 - 2) * (num2 - 2) == yellow) {
                    answer[0] = num1;
                    answer[1] = num2;
                    break;
                }
            }
        }
        
        return answer;
    }
}
