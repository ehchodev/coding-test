/**
 * @param {number} start
 * @param {number} goal
 * @return {number}
 */
var minBitFlips = function(start, goal) {
    let diff = start ^ goal;
    let count = 0;
    while (diff > 0) {
        diff = diff & (diff - 1);
        count++;
    }
    return count;
};
