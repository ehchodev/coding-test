function solution(rsp) {
    const obj = {
        '0' : '5',
        '2' : '0',
        '5' : '2'
    };
    
    return [...rsp].map(v => { return obj[v] }).join('');
}
