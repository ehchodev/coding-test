function solution(a, b) {
    let answer = 1;
    
    const alist = [];
    for (let i=2; i<=a; i++) {
        if (a % i === 0) {
            alist.push(i);
            a /= parseInt(i);
            i = 1;
        }
    }
    
    const blist = [];
    for (let j=2; j<=b; j++) {
        if (b % j === 0) {
            blist.push(j);
            b /= parseInt(j);
            j = 1;
        }
    }
    
    for (let k=0; k<alist.length; k++) {
        for (let l=0; l<blist.length; l++) {
            if (alist[k] === blist[l]) {
                alist[k] = 0;
                blist[l] = 0;
                break;
            }
        }
    }
    
    for (const n of blist) {
        if (n != 0 && n !== 2 && n !== 5) {
            answer = 2;
            break;
        }
    }
    
    return answer;
}
