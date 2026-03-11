class Solution {
    public int solution(int[][] signals) {
        int answer = -1;
        
        for (int i = 1; i < 9999999; i++) {
            boolean isAllYellow = true;
            
            for (int[] s : signals) {
                int G = s[0], Y = s[1], R = s[2];
                int cycle = G + Y + R;
                int time = (i % cycle == 0) ? cycle : i % cycle;
                
                if ( !(time > G && time <= G + Y) ) {
                    isAllYellow = false;
                    break;
                }
            }
            
            if (isAllYellow) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}
