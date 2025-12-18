import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int lastIndex = people.length;
        for (int i = 0; i < people.length; i++) {
            if (people[i] == 0) continue;
            
            while (i < lastIndex) {
                lastIndex--;
                
                if (people[i] + people[lastIndex] <= limit) {
                    people[lastIndex] = 0;
                    break;
                }
            }
            
            answer++;
        }
        
        return answer;
    }
}
