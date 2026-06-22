/**
 * @param {number} n
 * @return {number}
 */
var digitFrequencyScore = function(n) {
    let score = 0;

    const freq = new Array(10).fill(0);
    while (n > 0) {
        freq[n % 10]++;
        n = Math.floor(n / 10);
    }

    for (let d = 1; d < freq.length; d++) {
        score += d * freq[d];
    }

    return score;
};
