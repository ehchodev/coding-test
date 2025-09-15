class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int length = 0;
        for (int num : arr) {
            length += num;
        }
        
        answer = new int[length];
        
        int idx = 0;
        for (int num : arr) {
            for (int i=0; i<num; i++) {
                answer[idx++] = num;
            }
        }
        
        return answer;
    }
}
