class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for (String key : keyinput) {
            if ("up".equals(key)) {
                if (answer[1] >= board[1] / 2) continue;
                answer[1]++;
            } else if ("down".equals(key)) {
                if (answer[1] <= board[1] / 2 * -1) continue;
                answer[1]--;
            } else if ("left".equals(key)) {
                if (answer[0] <= board[0] / 2 * -1) continue;
                answer[0]--;
            } else if ("right".equals(key)) {
                if (answer[0] >= board[0] / 2) continue;
                answer[0]++;
            }
        }
        
        return answer;
    }
}
