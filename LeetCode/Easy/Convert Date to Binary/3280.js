/**
 * @param {string} date
 * @return {string}
 */
var convertDateToBinary = function(date) {
    const year = (+date.substring(0, 4)).toString(2);
    const month = (+date.substring(5, 7)).toString(2);
    const day = (+date.substring(8)).toString(2);
    return `${year}-${month}-${day}`;
};
