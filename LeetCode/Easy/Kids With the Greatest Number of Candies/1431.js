/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    const length = candies.length;
    const result = new Array(length);
    
    let max = candies[0];
    for (let i = 1; i < length; i++) {
        if (candies[i] > max) {
            max = candies[i];
        }
    }

    for (let i = 0; i < length; i++) {
        result[i] = candies[i] + extraCandies >= max;
    }

    return result;
};
