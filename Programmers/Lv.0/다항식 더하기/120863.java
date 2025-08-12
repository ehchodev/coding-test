class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        String[] arr = polynomial.split(" ");
        int num1 = 0, num2 = 0;
        
        for (int i=0; i<arr.length; i++) {
            if ("+".equals(arr[i])) continue;
            
            if (arr[i].contains("x")) {
                num1 += (arr[i].equals("x")) ? 1 : Integer.parseInt(arr[i].split("x")[0]);
            } else {
                num2 += Integer.parseInt(arr[i]);
            }
        }
        
        answer += num1 > 0 ? (num1 > 1 ? num1 : "") + "x" : "";
        answer += num2 > 0 ? (num1 > 0 ? " + " : "") + num2 : "";
        
        return answer;
    }
}
