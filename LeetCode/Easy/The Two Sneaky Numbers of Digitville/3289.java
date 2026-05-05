class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        boolean[] check = new boolean[nums.length];

        int i = 0;
        for (int num : nums) {
            if (check[num]) {
                result[i++] = num;
                if (i == 2) break;
            }
            check[num] = true;
        }

        return result;
    }
}
