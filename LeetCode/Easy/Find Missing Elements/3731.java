class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] exists = new boolean[101];
        
        int min = 100, max = 1;
        for (int i = 0; i < nums.length; i++) {
            exists[nums[i]] = true;

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!exists[i]) {
                list.add(i);
            }
        }

        return list;
    }
}
