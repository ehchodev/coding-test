class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] arr = new int[n];
        for (int l : lost) arr[l - 1]--;
        for (int r : reserve) arr[r - 1]++;
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && arr[i] == -1 &&arr[i - 1] == 1) {
                arr[i]++;
                arr[i - 1]--;
            } else if (i < n - 1 && arr[i] == -1 && arr[i + 1] == 1) {
                arr[i]++;
                arr[i + 1]--;
            }
            
            if (arr[i] > -1) answer++;
        }
        
        return answer;
    }
}
