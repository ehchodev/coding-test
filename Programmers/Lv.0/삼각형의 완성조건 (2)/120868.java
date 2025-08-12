class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max1 = Math.max(sides[0], sides[1]);
        int min1 = Math.min(sides[0], sides[1]);
        for (int i=max1-min1+1; i<min1+max1; i++) {
            answer++;
        }
        
        int max2 = sides[0] + sides[1];
        for (int i=max1+1; i<=max2-max1; i++) {
            answer++;
        }
        
        return answer;
    }
}
