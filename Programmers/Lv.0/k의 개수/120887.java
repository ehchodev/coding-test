class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int a=i; a<=j; a++) {
            String kstr = String.valueOf(k);
            String[] astr = String.valueOf(a).split("");
            for (String s : astr) {
                if (kstr.equals(s)) answer++;
            }
        }
        
        return answer;
    }
}
