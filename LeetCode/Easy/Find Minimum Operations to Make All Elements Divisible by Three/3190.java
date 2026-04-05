class Solution {
    public int minimumOperations(int[] nums) {
        int output = 0;
        for (int num : nums) if (num % 3 != 0) output++;
        return output;
    }
}
