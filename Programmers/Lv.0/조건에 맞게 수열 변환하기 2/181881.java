import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        
        int[] arr2 = new int[arr.length];
        boolean flag = true;
        
        while (flag) {
            answer++;
            arr2 = Arrays.copyOf(arr, arr.length);
            
            for (int i=0; i<arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] *= 2;
                    arr[i]++;
                }
            }
            
            for (int j=0; j<arr.length; j++) {
                if (arr[j] != arr2[j]) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
        }
        
        return answer;
    }
}
