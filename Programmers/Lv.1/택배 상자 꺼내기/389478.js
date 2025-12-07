function solution(n, w, num) {
    let answer = 0;
    
    while (num <= n) {
        const x = parseInt( (num - 1) / w );
        const position = (num - 1) % w;
        const y = (x % 2 === 0) ? position : w - position - 1;
        
        if (x % 2 === 0) {
            num = num + (w - y) + (w - y - 1);
        } else {
            num = num + y + y + 1;
        }
        
        answer++;
    }
    
    return answer;
}
