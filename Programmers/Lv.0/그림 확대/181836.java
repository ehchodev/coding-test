class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for (int a=0; a<picture.length; a++) {
            String[] str = picture[a].split("");
            String s = "";
            
            for (int b=0; b<str.length; b++) {
                s += str[b].repeat(k);
            }
            
            for (int c=0; c<k; c++) {
                answer[(a * k) + c] = s;
            }
        }
        
        return answer;
    }
}
