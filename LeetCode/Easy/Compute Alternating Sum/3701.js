/**
 * @param {number[]} nums
 * @return {number}
 */
var alternatingSum = function(nums) {
    return nums.reduce((acc, cur, i) => acc + (i % 2 === 0 ? cur : -cur), 0);
};
