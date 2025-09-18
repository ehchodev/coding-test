function solution(myString) {
    const answer = myString.split('x', -1).map(v => v.length);
    return answer;
}
