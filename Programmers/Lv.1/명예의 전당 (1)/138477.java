import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] arr = new int[k];
        for (int i=0; i<score.length; i++) {
            if (i < k) {
                arr[i] = score[i];
                if (arr[0] > score[i]) {
                    int temp = arr[0];
                    arr[0] = score[i];
                    arr[i] = temp;
                }
            
            } else {
                if (score[i] > arr[0]) {
                    arr[0] = score[i];
                }
                
                Arrays.sort(arr);
            }
            
            answer[i] = arr[0];
        }
        
        return answer;
    }
}
