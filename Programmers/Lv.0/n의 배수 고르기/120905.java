class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int cnt = numlist.length;
        for (int i=0; i<numlist.length; i++) {
            if (numlist[i] % n != 0) {
                numlist[i] = 0;
                cnt--;
            }
        }
        
        answer = new int[cnt];
        int idx = 0;
        for (int num : numlist) {
            if (num > 0) {
                answer[idx] = num;
                idx++;
            }
        }
        
        return answer;
    }
}
