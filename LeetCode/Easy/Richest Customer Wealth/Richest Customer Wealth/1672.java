class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximum = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int money : account) sum += money;
            if (maximum < sum) maximum = sum;
        }
        return maximum;
    }
}
