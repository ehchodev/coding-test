function solution(n) {
    const answer = [...n.toString().split('')].reverse().map(v => +v);
    return answer;
}
