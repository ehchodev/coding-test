function solution(s, skip, index) {
    let answer = '';
    
    let alphabets = 'abcdefghijklmnopqrstuvwxyz';
    skip.split('').forEach(v => alphabets = alphabets.replaceAll(v, ''));
    
    s.split('').forEach(v2 => {
        const i = alphabets.indexOf(v2) + index;
        answer += alphabets.charAt(i % alphabets.length);
    });
    
    return answer;
}
