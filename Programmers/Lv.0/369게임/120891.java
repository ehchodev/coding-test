class Solution {
    public int solution(int order) {
        int answer = 0;
        
        for (String num : String.valueOf(order).split("")) {
            if (num.equals("3") || num.equals("6") || num.equals("9")) {
                answer++;
            }
        }
        
        return answer;
    }
}
