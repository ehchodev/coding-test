function solution(park, routes) {
    let answer = [];
    
    let [x, y] = [0, 0];
    for (let i = 0; i < park.length; i++) {
        const index = park[i].indexOf('S');
        if (index > -1) {
            [x, y] = [i, index];
            break;
        }
    }
    
    for (const route of routes) {
        const r = route.split(' ');
        let [op, n] = r;
        n = Number(n);
        
        let moveFlag = true;
        for (let m = 1; m <= n; m++) {
            if (op === 'N') {
                moveFlag = (x - n >= 0 && park[x - m].charAt(y) !== 'X');
            
            } else if (op === 'S') {
                moveFlag = (x + n < park.length && park[x + m].charAt(y) !== 'X');
                
            } else if (op === 'W') {
                moveFlag = (y - n >= 0 && park[x].charAt(y - m) !== 'X');
                
            } else if (op === 'E') {
                moveFlag = (y + n < park[x].length && park[x].charAt(y + m) !== 'X');
            }
            
            if (!moveFlag) break;
        }
        
        if (moveFlag) {
            if (op === 'N') x -= n;
            else if (op === 'S') x += n;
            else if (op === 'W') y -= n;
            else if (op === 'E') y += n;
        }
    }
    
    answer = [x, y];
    
    return answer;
}
