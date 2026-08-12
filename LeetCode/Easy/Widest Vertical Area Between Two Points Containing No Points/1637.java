class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xArr = new int[n];
        for (int i = 0; i < n; i++) {
            xArr[i] = points[i][0];
        }

        Arrays.sort(xArr);

        int maxWidth = 0;
        for (int i = 1; i < n; i++) {
            int width = xArr[i] - xArr[i - 1];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
    }
}
