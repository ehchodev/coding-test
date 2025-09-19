function solution(num_list) {
    const l = num_list.length;
    const answer = num_list.reduce((a, b) => (l >= 11) ? a + b : a * b, (l >= 11) ? 0 : 1);
    return answer;
}
