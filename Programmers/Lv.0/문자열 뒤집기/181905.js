function solution(my_string, s, e) {
    let answer = '';
    
    const str = [...my_string];
    for (let i=0; i<=(e-s)/2; i++) {
        const temp = str[s + i];
        str[s + i] = str[e - i];
        str[e - i] = temp;
    }
    
    answer = str.join('');
    
    return answer;
}
