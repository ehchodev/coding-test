function solution(num_list) {
    const answer = [...num_list];
    
    const l = num_list.length;
    const a = num_list[l - 1];
    const b = num_list[l - 2];
    if (a > b) {
        answer.push(a - b);
    } else {
        answer.push(a * 2);
    }
    
    return answer;
}
