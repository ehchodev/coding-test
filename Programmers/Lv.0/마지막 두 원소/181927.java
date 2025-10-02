class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];
        
        for (int i=0; i<l; i++) {
            answer[i] = num_list[i];
        }
        
        int a = num_list[l - 1];
        int b = num_list[l - 2];
        if (a > b) {
            answer[l] = a - b;
        } else {
            answer[l] = a * 2;
        }
        
        return answer;
    }
}
