function solution(i, j, k) {
    let answer = 0;
    
    for (let a=i; a<=j; a++) {
        const kstr = k.toString();
        const astr = a.toString().split('');
        astr.forEach(v => {
            if (kstr === v) answer++
        });
    }
    
    return answer;
}
