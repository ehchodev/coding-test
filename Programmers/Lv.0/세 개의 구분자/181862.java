class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        String[] str = myStr.replaceAll("a|b|c", " ").split(" ");
        
        int cnt = 0;
        for (String s : str) if (!"".equals(s)) cnt++;
        
        if (cnt == 0) cnt++;
        answer = new String[cnt];
        
        int idx = 0;
        for (String s : str) if (!"".equals(s)) answer[idx++] = s;
        
        if (answer[0] == null) answer[0] = "EMPTY";
        
        return answer;
    }
}
