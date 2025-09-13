class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    arr[i] = 0;
                    cnt++;
                    break;
                }
            }
        }
        
        answer = new int[arr.length - cnt];
        int idx = 0;
        for (int n : arr) {
            if (n != 0) {
                answer[idx] = n;
                idx++;
            }
        }
        
        return answer;
    }
}
