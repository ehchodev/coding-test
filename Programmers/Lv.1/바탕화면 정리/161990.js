function solution(wallpaper) {
    let answer = [];
    
    let [lux, luy, rdx, rdy] = [50, 50, 0, 0];
    for (let x = 0; x < wallpaper.length; x++) {
        for (let y = 0; y < wallpaper[x].length; y++) {
            
            if (wallpaper[x].charAt(y) === '#') {
                if (x < lux) lux = x;
                if (x + 1 > rdx) rdx = x + 1;
                if (y < luy) luy = y;
                if (y + 1 > rdy) rdy = y + 1;
            }
            
        }
    }
    
    answer = [lux, luy, rdx, rdy];
    
    return answer;
}
