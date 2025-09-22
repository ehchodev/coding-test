function solution(my_string) {
    const answer = new Array(52).fill(0);
    
    for (let i=0; i<my_string.length; i++) {
        const n = my_string.charCodeAt(i) - 65;
        answer[(n > 25) ? (n - 6) : n]++;
    }
    
    return answer;
}
