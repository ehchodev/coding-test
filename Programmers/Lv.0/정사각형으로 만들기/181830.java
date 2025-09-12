class Solution {
    public int[][] solution(int[][] arr) {
        int rownum = arr.length;
        int colnum = arr[0].length;
        int num = Math.max(rownum, colnum);
        
        int[][] answer = new int[num][num];
        
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}
