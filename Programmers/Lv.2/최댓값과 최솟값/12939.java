class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        int minNum = Integer.parseInt(strArr[0]);
        int maxNum = Integer.parseInt(strArr[0]);
        for (int i = 1; i < strArr.length; i++) {
            minNum = Math.min(minNum, Integer.parseInt(strArr[i]));
            maxNum = Math.max(maxNum, Integer.parseInt(strArr[i]));
        }
        
        answer = minNum + " " + maxNum;
        
        return answer;
    }
}
