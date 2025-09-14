function solution(num_str) {
    const answer = num_str.split('').reduce((a, b) => a + Number(b), 0);
    return answer;
}
