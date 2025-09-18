class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        int cnt = 0;
        for (int i=0; i<strArr.length; i++) {
            if (strArr[i].contains("ad")) { 
               strArr[i] = "";
            } else {
                cnt++;
            }
        }
        
        answer = new String[cnt];
        int idx = 0;
        for (int j=0; j<strArr.length; j++) {
            if (!"".equals(strArr[j])) {
                answer[idx++] = strArr[j];
            }
        }
        
        return answer;
    }
}
