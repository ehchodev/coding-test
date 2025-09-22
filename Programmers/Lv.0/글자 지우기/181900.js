function solution(my_string, indices) {
    const answer = [...my_string].filter((_, i) => !indices.includes(i)).join('');
    return answer;
}
