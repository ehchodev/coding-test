/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
    let maximum = 0;
    for (const account of accounts) {
        let sum = 0;
        for (const money of account) sum += money;
        if (maximum < sum) maximum = sum;
    }
    return maximum;
};
