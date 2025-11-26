class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        int[] scores = new int[3];
        int index = 0;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            if (c == 'D') {
                scores[index - 1] = (int) Math.pow(scores[index - 1], 2);
            } else if (c == 'T') {
                scores[index - 1] = (int) Math.pow(scores[index - 1], 3);
            } else if (c == '*') {
                scores[index - 1] *= 2;
                if (index >= 2) scores[index - 2] *= 2;
            } else if (c == '#') {
                scores[index - 1] *= -1;
            } else if (c != 'S') {
                if (dartResult.charAt(i + 1) == '0') {
                    scores[index] = Integer.parseInt(dartResult.substring(i, i + 2));
                    i++;
                } else {
                    scores[index] = (int) (c - '0');
                }
                index++;
            }
        }
        
        answer = scores[0] + scores[1] + scores[2];
        
        return answer;
    }
}
