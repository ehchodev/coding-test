import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = Arrays.copyOf(emergency, emergency.length);
        
        Arrays.sort(arr);
        
        for (int i=0; i<emergency.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (emergency[i] == arr[j]) {
                    answer[i] = emergency.length - j;
                }
            }
        }
        
        return answer;
    }
}
