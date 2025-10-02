class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            
            int t = answer[a];
            answer[a] = answer[b];
            answer[b] = t;
        }
        
        return answer;
    }
}
