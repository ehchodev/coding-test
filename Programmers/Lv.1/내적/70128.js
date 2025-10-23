function solution(a, b) {
    const answer = a.reduce((acc, _, i) => acc + (a[i] * b[i]), 0);
    return answer;
}
