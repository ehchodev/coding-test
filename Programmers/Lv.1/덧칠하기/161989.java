class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] arr = new int[n];
        for (int num : section) {
            arr[num - 1] = 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                for (int j = i; j < Math.min(i + m, arr.length); j++) {
                    arr[j] = 0;
                }
                answer++;
            }
        }
        
        return answer;
    }
}
