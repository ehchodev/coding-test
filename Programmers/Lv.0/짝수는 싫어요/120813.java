class Solution {
    public int[] solution(int n) {
        int length = n/2 + ((n%2 == 0) ? 0 : 1);
        int[] answer = new int[length];
        
        for (int i=1; i<=n; i+=2) {
            answer[i/2] = i;
        }
        
        return answer;
    }
}
