function solution(n, numlist) {
    const answer = numlist.filter(v => v % n === 0);
    return answer;
}
