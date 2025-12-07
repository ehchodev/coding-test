class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        
        int lux = 50, luy = 50, rdx = 0, rdy = 0;
        for (int x = 0; x < wallpaper.length; x++) {
            for (int y = 0; y < wallpaper[x].length(); y++) {
                
                if (wallpaper[x].charAt(y) == '#') {
                    if (x < lux) lux = x;
                    if (x + 1 > rdx) rdx = x + 1;
                    if (y < luy) luy = y;
                    if (y + 1 > rdy) rdy = y + 1;
                }
                
            }
        }
        
        answer = new int[] {lux, luy, rdx, rdy};
        
        return answer;
    }
}
