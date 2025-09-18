function solution(myString, pat) {
    const answer = myString.split('').filter((_, i) => myString.substr(i, pat.length).includes(pat)).length;
    return answer;
}
