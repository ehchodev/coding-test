class Solution {
    final static String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
    
    public String solution(int age) {
        String answer = "";
        
        for (String a : String.valueOf(age).split("")) {
            answer += alphabet[Integer.parseInt(a)];
        }
        
        return answer;
    }
}
