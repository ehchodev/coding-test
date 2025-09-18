function solution(myString, pat) {
    const answer = (myString.split('').map(v => (v === 'A') ? 'B' : 'A').join('').includes(pat)) ? 1 : 0;    
    return answer;
}
