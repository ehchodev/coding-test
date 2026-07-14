/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    const len = nums.length;
    const arr = new Array(len);
    const cntarr = new Array(101).fill(0);

    let max = 0;
    for (let i = 0; i < len; i++) {
        const num = nums[i];
        cntarr[num]++;
        if (num > max) {
            max = num;
        }
    }

    let sum = 0;
    for (let i = 0; i <= max; i++) {
        const currcnt = cntarr[i];
        cntarr[i] = sum;
        sum += currcnt;
    }

    for (let i = 0; i < len; i++) {
        arr[i] = cntarr[nums[i]];
    }

    return arr;
};
