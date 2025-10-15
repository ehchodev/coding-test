function solution(n) {
    const answer = Number([...n.toString()].sort().reverse().join(''));
    return answer;
}
