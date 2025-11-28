import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        String[] columns = { "code", "date", "maximum", "remain" };
        List<String> columnList = Arrays.asList(columns);
        
        int extIndex = columnList.indexOf(ext);
        int sortIndex = columnList.indexOf(sort_by);
        
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i][extIndex] < val_ext) {
                list.add(data[i]);
            }
        }
        
        answer = list.toArray(new int[list.size()][]);
        for (int a = 0; a < answer.length - 1; a++) {
            for (int b = a + 1; b < answer.length; b++) {
                if (answer[a][sortIndex] > answer[b][sortIndex]) {
                    int[] temp = answer[a];
                    answer[a] = answer[b];
                    answer[b] = temp;
                }
            }
        }
        
        return answer;
    }
}
