class Solution {
    public int[] transformArray(int[] nums) {
        int count = 0;
        
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            nums[j] = (j < count) ? 0 : 1;
        }

        return nums;
    }
}
