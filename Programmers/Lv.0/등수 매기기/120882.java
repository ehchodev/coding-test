class Solution {
    public int[] solution(int[][] score) {
        int[] rank = new int[score.length];
        
        double[] avg = new double[score.length];
        for (int a=0; a<avg.length; a++) {
            avg[a] = (double) (score[a][0] + score[a][1]) / 2;
        }
        
        for (int i=0; i<avg.length; i++) {
            int r = 1;
            for (int j=0; j<avg.length; j++) {
                if (avg[i] < avg[j]) r++;
            }
            rank[i] = r;
        }
        
        return rank;
    }
}
