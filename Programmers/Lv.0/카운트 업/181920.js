function solution(start_num, end_num) {
    const answer = new Array(end_num - start_num + 1).fill(start_num).map((v, i) => v + i);
    return answer;
}
