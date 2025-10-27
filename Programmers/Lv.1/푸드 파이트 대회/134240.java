class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String numStr = "";
        for (int i=1; i<food.length; i++) {
            int num = (food[i] % 2 == 0) ? food[i] : food[i] - 1;
            num /= 2;
            
            numStr += String.valueOf(i).repeat(num);
        }
        
        answer += numStr + "0";
        for (int j=numStr.length()-1; j>=0; j--) {
            answer += numStr.charAt(j);
        }
        
        return answer;
    }
}
