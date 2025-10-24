class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxW = Math.max(sizes[0][0], sizes[0][1]);
        int maxH = Math.min(sizes[0][0], sizes[0][1]);
        for (int[] size : sizes) {
            int w = Math.max(size[0], size[1]);
            int h = Math.min(size[0], size[1]);
            
            if (w > maxW) maxW = w;
            if (h > maxH) maxH = h;
        }
        
        answer = maxW * maxH;
        
        return answer;
    }
}
