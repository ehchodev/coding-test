function solution(myStr) {
    const answer = myStr.replaceAll(/a|b|c/g, ' ').split(' ').filter(v => v !== '');
    if (answer.length == 0) answer.push('EMPTY');
    return answer;
}
