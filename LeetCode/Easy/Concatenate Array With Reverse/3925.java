class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        System.arraycopy(nums, 0, ans, 0, n);

        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[n - i - 1];
        }

        return ans;
    }
}
