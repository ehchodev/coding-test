function solution(numbers) {
    const answer = new Array(10).fill(0).reduce((a, _, i) => a + (numbers.includes(i) ? 0 : i), 0);
    return answer;
}
