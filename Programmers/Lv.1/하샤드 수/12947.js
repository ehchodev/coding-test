function solution(x) {
    const answer = (x % [...x.toString()].reduce((a, b) => a + Number(b), 0) === 0);
    return answer;
}
