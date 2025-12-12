class Solution {
    public int solution(int n) {
        int answer = n;
        
        String binaryN = Integer.toBinaryString(n);
        int countN = 0;
        for (char c : binaryN.toCharArray()) {
            if (c == '1') countN++;
        }
        
        int count = 0;
        while (count != countN) {
            count = 0;
            
            String binary = Integer.toBinaryString(++answer);
            for (char c : binary.toCharArray()) {
                if (c == '1') count++;
            }
        }
        
        return answer;
    }
}
