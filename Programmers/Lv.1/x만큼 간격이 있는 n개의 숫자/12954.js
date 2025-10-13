function solution(x, n) {
    const answer = new Array(n).fill(x).map((v, i) => v * (i + 1));
    return answer;
}
