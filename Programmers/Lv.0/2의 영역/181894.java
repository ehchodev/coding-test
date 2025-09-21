class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int s = -1;
        int e = -1;
        for (int i=0; i<arr.length; i++) {
            if (s == -1 && arr[i] == 2) s = i;
            if (e == -1 && arr[arr.length - 1 - i] == 2) e = arr.length - 1 - i;
            if (s != -1 && e != -1) break;
        }
        
        answer = new int[e - s + 1];
        if (s == -1) {
            answer[0] = -1;
        } else {
            int idx = 0;
            for (int j=s; j<=e; j++) answer[idx++] = arr[j];
        }
        
        return answer;
    }
}
