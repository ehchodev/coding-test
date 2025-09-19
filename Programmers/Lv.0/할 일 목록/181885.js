function solution(todo_list, finished) {
    const answer = todo_list.filter((v, i) => !finished[i]);
    return answer;
}
