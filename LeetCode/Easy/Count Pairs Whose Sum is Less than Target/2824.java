class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int n = nums.size();

        Collections.sort(nums);

        int left = 0, right = n - 1;
        while (left < right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
