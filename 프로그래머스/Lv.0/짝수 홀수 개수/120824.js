function solution(num_list) {
    const answer = [0, 0];
    
    num_list.forEach(v => answer[v % 2]++);
    
    return answer;
}
