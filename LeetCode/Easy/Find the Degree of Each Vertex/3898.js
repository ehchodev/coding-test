/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var findDegrees = function(matrix) {
    return matrix.map(v => v.reduce((acc, cur) => acc + cur, 0));
};
