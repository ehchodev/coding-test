class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[] rates = new double[N];
        for (int i = 1; i <= N; i++) {
            int tryCount = 0;
            int failCount = 0;
            for (int stage : stages) {
                if (stage >= i) tryCount++;
                if (stage == i) failCount++;
            }
            
            answer[i - 1] = i;
            rates[i - 1] = (double) failCount / tryCount;
        }
        
        for (int a = 0; a < rates.length - 1; a++) {
            for (int b = a + 1; b < rates.length; b++) {
                if ((rates[a] < rates[b]) || (rates[a] == rates[b] && answer[a] > answer[b])) {
                    double rateTemp = rates[a];
                    rates[a] = rates[b];
                    rates[b] = rateTemp;
                    
                    int stageTemp = answer[a];
                    answer[a] = answer[b];
                    answer[b] = stageTemp;
                }
            }
        }
        
        return answer;
    }
}
