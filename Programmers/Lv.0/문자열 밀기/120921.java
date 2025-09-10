class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        
        int l = A.length();
        int cnt = 0;
        for (int i=0; i<l; i++) {
            if (A.equals(B)) {
                answer = cnt;
                break;
            }
            
            A = A.substring(l-1, l) + A.substring(0, l-1);
            cnt++;
        }
        
        return answer;
    }
}
