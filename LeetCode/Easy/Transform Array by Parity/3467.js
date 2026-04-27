/**
 * @param {number[]} nums
 * @return {number[]}
 */
var transformArray = function(nums) {
    let count = 0;
    
    for (num of nums) {
        if (num % 2 === 0) {
            count++;
        }
    }

    for (let j = 0; j < nums.length; j++) {
        nums[j] = (j < count) ? 0 : 1;
    }

    return nums;
};
