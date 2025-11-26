class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {7, 7};
        
        for (int n : lottos) {
            for (int wn : win_nums) {
                if (n == wn) {
                    answer[0]--;
                    answer[1]--;
                }
            }
            
            if (n == 0) answer[0]--;
        }
        
        if (answer[0] > 6) answer[0] = 6;
        if (answer[1] > 6) answer[1] = 6;
        
        return answer;
    }
}
