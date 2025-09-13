function solution(n_str) {
    let answer = '';
    
    for (let i=0; i<n_str.length; i++) {
        if (n_str.charAt(i) !== '0') {
            answer = n_str.slice(i);
            break;
        }
    }
    
    return answer;
}
