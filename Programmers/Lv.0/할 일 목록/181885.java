class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        int cnt = 0;
        for (boolean f : finished) if (!f) cnt++;
        
        answer = new String[cnt];
        
        int idx = 0;
        for (int i=0; i<finished.length; i++) {
            if (!finished[i]) {
                answer[idx++] = todo_list[i];
            }
        }
        
        return answer;
    }
}
