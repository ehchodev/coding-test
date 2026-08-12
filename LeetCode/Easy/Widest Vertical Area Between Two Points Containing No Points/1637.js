/**
 * @param {number[][]} points
 * @return {number}
 */
var maxWidthOfVerticalArea = function(points) {
    const n = points.length;
    const xArr = new Array(n);
    for (let i = 0; i < n; i++) {
        xArr[i] = points[i][0];
    }

    xArr.sort((a, b) => a - b);

    let maxWidth = 0;
    for (let i = 1; i < n; i++) {
        const width = xArr[i] - xArr[i - 1];
        if (width > maxWidth) {
            maxWidth = width;
        }
    }

    return maxWidth;
};
