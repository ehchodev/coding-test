function solution(babbling) {
    const answer = babbling.filter(v => v.replace('aya', ' ').replace('ye', ' ')
                                   .replace('woo', ' ').replace('ma', ' ').trim() === '').length;
    return answer;
}
