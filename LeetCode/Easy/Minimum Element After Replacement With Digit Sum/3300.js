/**
 * @param {number[]} nums
 * @return {number}
 */
var minElement = function(nums) {
    let min = Infinity;

    for (let i = 0; i < nums.length; i++) {
        let num = nums[i];
        let sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = ~~(num / 10);
        }

        if (sum < min) {
            min = sum;
        }
    }

    return min;
};
