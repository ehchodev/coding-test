/**
 * @param {number[]} nums
 * @return {number[]}
 */
var findMissingElements = function(nums) {
    const exists = new Array(101).fill(false);

    let min = 100, max = 1;
    for (let i = 0; i < nums.length; i++) {
        exists[nums[i]] = true;

        if (nums[i] < min) {
            min = nums[i];
        }

        if (nums[i] > max) {
            max = nums[i];
        }
    }

    const list = [];
    for (let i = min; i <= max; i++) {
        if (!exists[i]) {
            list.push(i);
        }
    }

    return list;
};
