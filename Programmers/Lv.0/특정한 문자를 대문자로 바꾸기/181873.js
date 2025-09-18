function solution(my_string, alp) {
    const answer = [...my_string].map(v => (v === alp) ? v.toUpperCase() : v).join('');
    return answer;
}
