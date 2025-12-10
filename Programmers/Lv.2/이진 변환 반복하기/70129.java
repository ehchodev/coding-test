class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        int zeroCount = 0, count = 0;
        while (!"1".equals(s)) {
            String result = "";
            for (String str : s.split("")) {
                if ("0".equals(str)) {
                    zeroCount++;
                } else {
                    result += str;
                }
            }
            
            count++;
            s = Integer.toBinaryString(result.length());
        }
        
        answer = new int[] {count, zeroCount};
        
        return answer;
    }
}
