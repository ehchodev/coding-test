function solution(my_string, queries) {
    let answer = '';
    
    const str = [...my_string];
    for (const [s, e] of queries) {
        for (let i=0; i<=(e-s)/2; i++) {
            const t = str[s + i];
            str[s + i] = str[e - i];
            str[e - i] = t;
        }
    }
    
    answer = str.join('');
    
    return answer;
}
