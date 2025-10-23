import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if (arr.length > 1) {
            answer = new int[arr.length - 1];
            
            int[] arr2 = arr.clone();
            Arrays.sort(arr2);
            
            int min = arr2[0];
            int idx = 0;
            for (int n : arr) {
                if (n > min) {
                    answer[idx++] = n;
                }
            }
            
        } else {
            answer = new int[] { -1 };
        }
        
        return answer;
    }
}
