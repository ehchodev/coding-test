class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] bfarr = before.split("");
        String[] afarr = after.split("");
        
        for (int i=0; i<bfarr.length; i++) {
            for (int j=0; j<afarr.length; j++) {
                if (bfarr[i].equals(afarr[j])) {
                    afarr[j] = "";
                    break;
                }
            }
        }
        
        if (String.join("", afarr).equals("")) {
            answer = 1;
        }
        
        return answer;
    }
}
