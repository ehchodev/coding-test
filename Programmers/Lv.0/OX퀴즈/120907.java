class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            
            String operator = arr[1];
            int X = Integer.parseInt(arr[0]);
            int Y = Integer.parseInt(arr[2]);
            int Z = Integer.parseInt(arr[4]);
            
            int sign = (operator.equals("+")) ? 1 : -1;
            answer[i] = (X + (sign * Y) == Z) ? "O" : "X";
        }
        
        return answer;
    }
}
