/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRightDifference = function(nums) {
    const answer = [];
    
    let leftSum = 0, rightSum = 0;
    for (const num of nums) rightSum += num;

    for (let i = 0; i < nums.length; i++) {
        rightSum -= nums[i];
        answer.push(Math.abs(leftSum - rightSum));
        leftSum += nums[i];
    }

    return answer;
};
