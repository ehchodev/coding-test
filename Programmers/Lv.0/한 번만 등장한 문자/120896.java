import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split("");
        
        Arrays.sort(arr);
        
        for (int i=0; i<arr.length-1; i++) {
            String str = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                if (str.equals(arr[j])) {
                    arr[i] = "";
                    arr[j] = "";
                }
            }
        }
        
        answer = String.join("", arr);
        
        return answer;
    }
}
