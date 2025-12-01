import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int[][] keypad = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < keypad.length; i++) {
            for (int j = 0; j < keypad[i].length; j++) {
                map.put(keypad[i][j], new int[] {i, j});
            }
        }
        
        int[] lefthand = {3, 0}, righthand = {3, 2};
        
        for (int number : numbers) {
            String pointer = ("left".equals(hand)) ? "L" : "R";
            
            if (number == 1 || number == 4 || number == 7) {
                pointer = "L";
            } else if (number == 3 || number == 6 || number == 9) {
                pointer = "R";
            } else {
                int[] location = map.get(number);
                int leftcount = Math.abs(location[0] - lefthand[0]) + Math.abs(location[1] - lefthand[1]);
                int rightcount = Math.abs(location[0] - righthand[0]) + Math.abs(location[1] - righthand[1]);
                
                if (leftcount < rightcount) {
                    pointer = "L";
                } else if (leftcount > rightcount) {
                    pointer = "R";
                }
            }
            
            if ("L".equals(pointer)) {
                answer += "L";
                lefthand = map.get(number);
            } else {
                answer += "R";
                righthand = map.get(number);
            }
        }
        
        return answer;
    }
}
