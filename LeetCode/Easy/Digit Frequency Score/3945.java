class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;

        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }

        for (int d = 1; d < freq.length; d++) {
            score += d * freq[d];
        }

        return score;
    }
}
