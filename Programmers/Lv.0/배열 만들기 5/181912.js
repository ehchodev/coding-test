function solution(intStrs, k, s, l) {
    const answer = intStrs.map(v => Number(v.slice(s, s + l))).filter(v => v > k);
    return answer;
}
