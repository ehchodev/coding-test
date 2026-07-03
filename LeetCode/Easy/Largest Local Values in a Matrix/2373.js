/**
 * @param {number[][]} grid
 * @return {number[][]}
 */
var largestLocal = function(grid) {
    const n = grid.length;
    const maxLocal = Array.from({ length: n - 2}, () => new Int32Array(n - 2));

    for (let i = 0; i < n - 2; i++) {
        for (let j = 0; j < n - 2; j++) {
            let max = 0;

            for (let a = i; a < i + 3; a++) {
                for (let b = j; b < j + 3; b++) {
                    max = grid[a][b] > max ? grid[a][b] : max;
                }
            }

            maxLocal[i][j] = max;
        }
    }

    return maxLocal;
};
