class Solution {
    public int[] solution(int[] arr, int n) {
        int l = arr.length;
        int[] answer = new int[l];
        
        for (int i=0; i<l; i++) {
            int num = arr[i];
            if ((l % 2 == 0 && i % 2 == 1) || (l % 2 == 1 && i % 2 == 0)) num += n;
            answer[i] = num;
        }
        
        return answer;
    }
}
