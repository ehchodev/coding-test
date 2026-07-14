class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int[] cntarr = new int[101];
        
        int max = 0;
        for (int num : nums) {
            cntarr[num]++;
            if (num > max) {
                max = num;
            }
        }

        int sum = 0;
        for (int i = 0; i <= max; i++) {
            int currcnt = cntarr[i];
            cntarr[i] = sum;
            sum += currcnt;
        }

        for (int i = 0; i < nums.length; i++) {
            arr[i] = cntarr[nums[i]];
        }

        return arr;
    }
}
