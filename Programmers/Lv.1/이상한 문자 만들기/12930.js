function solution(s) {
    let answer = '';
    
    const str = s.split('');
    let upperFlag = true;
    
    for (let i=0; i<str.length; i++) {
        if (upperFlag && str[i] !== ' ') {
            str[i] = str[i].toUpperCase();
            upperFlag = false;
        } else {
            str[i] = str[i].toLowerCase();
            upperFlag = true;
        }
    }
    
    answer = str.join('');
    
    return answer;
}
