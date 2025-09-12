function solution(myString) {
    let answer = '';
    
    for (let i=0; i<myString.length; i++) {
        const c = myString.charAt(i);
        answer += (c < 'l') ? 'l' : c;
    }
    
    return answer;
}
