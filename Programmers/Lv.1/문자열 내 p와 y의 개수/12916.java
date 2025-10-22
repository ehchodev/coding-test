class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0, yCnt = 0;
        for (String ss : s.split("")) {
            if ("P".equals(ss.toUpperCase())) {
                pCnt++;
            } else if ("Y".equals(ss.toUpperCase())) {
                yCnt++;
            }
        }
        
        answer = (pCnt == yCnt);

        return answer;
    }
}
