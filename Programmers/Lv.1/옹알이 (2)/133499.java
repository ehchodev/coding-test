class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] arr = {"aya", "ye", "woo", "ma"};
        for (String b : babbling) {
            for (String a : arr) {
                if (b.contains(a.repeat(2))) break;
                b = b.replaceAll(a, " ");
            }
            
            if ("".equals(b.trim())) answer++;
        }
        
        return answer;
    }
}
