/**
 * @param {string} jewels
 * @param {string} stones
 * @return {number}
 */
var numJewelsInStones = function(jewels, stones) {
    const set = new Set(jewels);
    const count = [...stones].reduce((acc, cur) => set.has(cur) ? acc + 1 : acc, 0);
    return count;
};
