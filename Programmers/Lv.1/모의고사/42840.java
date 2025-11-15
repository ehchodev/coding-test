import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i % arr1.length]) score[0]++;
            if (answers[i] == arr2[i % arr2.length]) score[1]++;
            if (answers[i] == arr3[i % arr3.length]) score[2]++;
        }
        
        List<Integer> list = new ArrayList<>();
        int max = Math.max(Math.max(score[0], score[1]), score[2]);
        for (int j = 0; j < score.length; j++) {
            if (score[j] == max) list.add(j + 1);
        }
        
        answer = new int[list.size()];
        for (int k = 0; k < answer.length; k++) {
            answer[k] = list.get(k);
        }
        
        return answer;
    }
}
