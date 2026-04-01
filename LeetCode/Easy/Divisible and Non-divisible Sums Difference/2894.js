/**
 * @param {number} n
 * @param {number} m
 * @return {number}
 */
var differenceOfSums = function(n, m) {
    let output = 0;
    for (let i = 1; i <= n; i++) output += (i % m === 0) ? -i : i;
    return output;
};
