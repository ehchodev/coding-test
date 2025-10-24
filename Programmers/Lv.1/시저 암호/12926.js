function solution(s, n) {
    let answer = '';
    
    const arr = s.split('');
    for (let i=0; i<s.length; i++) {
        if (arr[i] !== ' ') {
            let c = s.charCodeAt(i);
            if ((c <= 90 && (c + n) > 90) || (c + n) > 122) {
                c -= 26;
            }
            
            arr[i] = String.fromCharCode(c + n);
        }
    }
    
    answer = arr.join('');
    
    return answer;
}
