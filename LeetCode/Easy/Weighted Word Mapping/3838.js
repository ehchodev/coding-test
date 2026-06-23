/**
 * @param {string[]} words
 * @param {number[]} weights
 * @return {string}
 */
var mapWordWeights = function(words, weights) {
    const len = words.length;
    const result = new Array(len);

    for (let i = 0; i < len; i++) {
        const word = words[i];
        let weight = 0;

        for (let j = 0; j < word.length; j++) {
            weight += weights[word.charCodeAt(j) - 97];
        }

        weight %= 26;

        result[i] = String.fromCharCode(122 - weight);
    }

    return result.join('');
};
