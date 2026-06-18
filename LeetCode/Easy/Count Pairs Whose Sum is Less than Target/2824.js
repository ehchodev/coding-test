/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var countPairs = function(nums, target) {
    let count = 0;
    const n = nums.length;

    nums.sort((a, b) => b - a);

    let left = 0, right = n - 1;
    while (left < right) {
        if (nums[i] + nums[j] < target) {
            count += (right - left);
            left++;
        } else {
            right--;
        }
    }

    return count;
};
