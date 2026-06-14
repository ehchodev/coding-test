/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var findPermutationDifference = function(s, t) {
    let sum = 0;

    const idxMap = {};
    for (let i = 0; i < s.length; i++) {
        idxMap[s.charAt(i)] = i;
    }

    for (let j = 0; j < t.length; j++) {
        sum += Math.abs(idxMap[t.charAt(j)] - j);
    }

    return sum;
};
