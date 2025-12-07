function solution(today, terms, privacies) {
    const answer = [];
    
    const termsObj = {};
    for (const term of terms) {
        const [t1, t2] = term.split(" ");
        termsObj[t1] = parseInt(t2);
    }
        
    for (let i = 0; i < privacies.length; i++) {
        const [pdate, pterm] = privacies[i].split(" ");
        
        let pyy = parseInt(pdate.slice(0, 4));
        let pmm = parseInt(pdate.slice(5, 7)) + termsObj[pterm];
        let pdd = parseInt(pdate.slice(8)) - 1;
        
        if (pdd == 0) {
            pmm -= 1;
            pdd = 28;
        }
        
        if (pmm > 12) {
            pyy += parseInt(pmm / 12);
            pmm %= 12;
            
            if (pmm == 0) {
                pyy -= 1;
                pmm = 12;
            }
        }
        
        const yy = parseInt(today.slice(0, 4));
        const mm = parseInt(today.slice(5, 7));
        const dd = parseInt(today.slice(8));
        
        if (yy > pyy || (yy == pyy && mm > pmm) || (yy == pyy && mm == pmm && dd > pdd)) {
            answer.push(i + 1);
        }
    }
    
    return answer;
}
