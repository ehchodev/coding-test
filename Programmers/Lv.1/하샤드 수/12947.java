class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int sum = 0;
        for (String s : String.valueOf(x).split("")) {
            sum += Integer.parseInt(s);
        }
        
        answer = (x % sum == 0);
        
        return answer;
    }
}
