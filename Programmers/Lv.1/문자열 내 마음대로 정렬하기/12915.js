function solution(strings, n) {
    const answer = strings.sort().sort((a, b) => a.charAt(n) >= b.charAt(n) ? 1 : -1);
    return answer;
}
