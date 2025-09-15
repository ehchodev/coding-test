import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] lengthArr = new int[30];
        for (String str : strArr) {
            lengthArr[str.length() - 1]++;
        }
        
        Arrays.sort(lengthArr);
        
        answer = lengthArr[29];
        
        return answer;
    }
}
