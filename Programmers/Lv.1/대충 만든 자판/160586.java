class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            for (String target : targets[i].split("")) {
                int count = 999;
                
                for (String keys : keymap) {
                    int index = keys.indexOf(target);
                    if (index > -1 && index < count) {
                        count = index;
                    }
                }
                
                if (count == 999) {
                    answer[i] = -1;
                    break;
                } else {
                    answer[i] += count + 1;
                }
            }
        }
        
        return answer;
    }
}
