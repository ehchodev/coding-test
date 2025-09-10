class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        int sum = -1;
        int start = 1;
        while (sum != total) {
            sum = 0;
            
            for (int i=start; i<start+num; i++) {
                sum += i;
                answer[i-start] = i;
            }
            
            if (sum > total) start -= 1;
            if (sum < total) start += 1;
        }
        
        return answer;
    }
}
