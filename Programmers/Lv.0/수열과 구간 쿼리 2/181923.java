class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int idx=0; idx<queries.length; idx++) {
            int s = queries[idx][0];
            int e = queries[idx][1];
            int k = queries[idx][2];
            
            int num = -1;
            for (int i=s; i<=e; i++) {
                if (arr[i] > k && (num == -1 || num > arr[i])) {
                    num = arr[i];
                }
            }
            
            answer[idx] = num;
        }
        
        return answer;
    }
}
