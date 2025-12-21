function solution(n, words) {
    const answer = [0, 0];
    
    const list = [];
    list.push(words[0]);
    
    for (let i = 1; i < words.length; i++) {
        const prevWordLast = words[i - 1].slice(-1);
        const currWordFirst = words[i].slice(0, 1);
        
        if (prevWordLast !== currWordFirst || list.includes(words[i])) {
            answer[0] = (i % n) + 1;
            answer[1] = parseInt(i / n) + 1;
            break;
        }
        
        list.push(words[i]);
    }

    return answer;
}
