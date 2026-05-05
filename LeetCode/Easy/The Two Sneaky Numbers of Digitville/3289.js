/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getSneakyNumbers = function(nums) {
    const result = [];
    const check = new Set();

    for (const num of nums) {
        if (check.has(num)) {
            result.push(num);
            if (result.length === 2) break;
        }
        check.add(num);
    }

    return result;
};
