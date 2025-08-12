function solution(spell, dic) {
    let answer = 2;
    
    dic.forEach(d => {
        let flag = true;
        
        spell.forEach(s => {
            if (d.indexOf(s) < 0) {
                flag = false;
                return;
            }
        });
        
        if (flag) {
            answer = 1;
            return;
        }
    });
    
    return answer;
}
