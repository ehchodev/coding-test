class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0], b = slicer[1], c = slicer[2];
        int idx = 0;
        
        if (n == 1) {
            answer = new int[b + 1];
            for (int i=0; i<=b; i++) answer[i] = num_list[i];
            
        } else if (n == 2) {
            answer = new int[num_list.length - a];
            for (int i=a; i<num_list.length; i++) answer[idx++] = num_list[i];
            
        } else if (n == 3) {
            answer = new int[b - a + 1];
            for (int i=a; i<=b; i++) answer[idx++] = num_list[i];
            
        } else {
            answer = new int[(b - a) / c + 1];
            for (int i=a; i<=b; i+=c) answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}
