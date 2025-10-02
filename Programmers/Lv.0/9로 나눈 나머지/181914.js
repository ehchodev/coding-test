function solution(number) {
    const answer = [...number].reduce((a, b) => a + Number(b), 0) % 9;
    return answer;
}
