class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        String odd = "", even = "";
        for (int num : num_list) {
            if (num % 2 == 0) {
                even += "" + num;
            } else {
                odd += "" + num;
            }
        }
        
        answer = Integer.parseInt(odd) + Integer.parseInt(even);
        
        return answer;
    }
}
