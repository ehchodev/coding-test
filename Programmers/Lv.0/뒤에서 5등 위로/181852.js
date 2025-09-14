function solution(num_list) {
    const answer = num_list.sort((a, b) => a - b).filter((_, i) => i >= 5);
    return answer;
}
