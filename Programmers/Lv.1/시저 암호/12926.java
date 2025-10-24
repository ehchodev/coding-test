class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        String[] arr = s.split("");
        for (int i=0; i<s.length(); i++) {
            if (!" ".equals(arr[i])) {
                int c = s.charAt(i);
                if ((c <= 90 && (c + n) > 90) || (c + n) > 122) {
                    c -= 26;
                }
                
                arr[i] = "" + (char) (c + n);
            }
        }
        
        answer = String.join("", arr);
        
        return answer;
    }
}
