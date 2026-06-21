/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var countPairs = function(nums, target) {
    let count = 0;
    const n = nums.length;

    nums.sort((a, b) => a - b);

    let left = 0, right = n - 1;
    while (left < right) {
        if (nums[left] + nums[right] < target) {
            count += (right - left);
            left++;
        } else {
            right--;
        }
    }

    return count;
};
