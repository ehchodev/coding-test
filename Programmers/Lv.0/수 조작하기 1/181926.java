class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for (String s : control.split("")) {
            if ("w".equals(s)) {
                answer += 1;
            } else if ("s".equals(s)) {
                answer -= 1;
            } else if ("d".equals(s)) {
                answer += 10;
            } else {
                answer -= 10;
            }
        }
        
        return answer;
    }
}
