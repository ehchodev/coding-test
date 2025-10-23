class Solution {
    public String solution(int n) {
        String answer = "수박".repeat(n / 2 + 1).substring(0, n);
        return answer;
    }
}
