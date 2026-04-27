/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    let count = 0;
    const freq = new Array(101).fill(0);

    for (const num of nums) {
        count += freq[num];
        freq[num]++;
    }

    return count;
};
