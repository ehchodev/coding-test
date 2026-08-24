/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let maxCnt = 0;

    for (let i = 0; i < sentences.length; i++) {
        let cnt = 1;

        for (let j = 0; j < sentences[i].length; j++) {
            if (sentences[i].charAt(j) === ' ') {
                cnt++;
            }
        }

        if (cnt > maxCnt) {
            maxCnt = cnt;
        }
    }

    return maxCnt;
};
