function solution(keymap, targets) {
    const answer = new Array(targets.length).fill(0);
    
    for (let i = 0; i < targets.length; i++) {
        for (const target of [...targets[i]]) {
            let count = 999;
            
            for (const keys of keymap) {
                const index = keys.indexOf(target);
                if (index > -1 && index < count) {
                    count = index;
                }
            }
            
            if (count === 999) {
                answer[i] = -1;
                break;
            } else {
                answer[i] += count + 1;
            }
        }
    }
    
    return answer;
}
