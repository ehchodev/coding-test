class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int m = 1, s = 0;
        for (int num : num_list) {
            m *= num;
            s += num;
        }
        
        answer = (m < s * s) ? 1 : 0;
        
        return answer;
    }
}
