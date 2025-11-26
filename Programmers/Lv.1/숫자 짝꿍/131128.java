import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
        char[] xArr = X.toCharArray();
        char[] yArr = Y.toCharArray();
        
        Arrays.sort(xArr);
        Arrays.sort(yArr);
        
        StringBuilder sb = new StringBuilder();
        int xIndex = xArr.length - 1, yIndex = yArr.length - 1;
        
        while (xIndex >= 0 && yIndex >= 0) {
            if (xArr[xIndex] == yArr[yIndex]) {
                sb.append(xArr[xIndex]);
                xIndex--;
                yIndex--;
            } else if (xArr[xIndex] > yArr[yIndex]) {
                xIndex--;
            } else {
                yIndex--;
            }
        }
        
        if (sb.length() == 0) {
            answer = "-1";
        } else if (sb.charAt(0) == '0') {
            answer = "0";
        } else {
            answer = sb.toString();
        }
        
        return answer;
    }
}
