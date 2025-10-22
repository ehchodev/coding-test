function solution(absolutes, signs) {
    const answer = absolutes.reduce((a, b, i) => a + (b * (signs[i] ? 1 : -1)), 0);
    return answer;
}
