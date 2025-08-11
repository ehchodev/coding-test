class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (String s : my_string.replaceAll("[^0-9]", "").split("")) {
            answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}
