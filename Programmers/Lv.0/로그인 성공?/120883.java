class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        
        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] arr : db) {
            if (id.equals(arr[0])) {                
                if (pw.equals(arr[1])) {
                    answer = "login";
                    break;
                }
                
                answer = "wrong pw";
            }
        }
        
        return answer;
    }
}
