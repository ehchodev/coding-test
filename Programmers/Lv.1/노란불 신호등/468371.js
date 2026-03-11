function solution(signals) {
    let answer = -1;
    
    for (let i = 1; i < 9999999; i++) {
        let isAllYellow = true;
        
        for (const [G, Y, R] of signals) {
            const cycle = G + Y + R;
            const time = (i % cycle == 0) ? cycle : i % cycle;
            
            if ( !(time > G && time <= G + Y) ) {
                isAllYellow = false;
                break;
            }
        }
        
        if (isAllYellow) {
            answer = i;
            break;
        }
    }
    
    return answer;
}
