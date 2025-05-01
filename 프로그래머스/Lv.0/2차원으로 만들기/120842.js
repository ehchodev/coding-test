function solution(num_list, n) {
    const answer = [];
    
    for (let i=0; i<=num_list.length/n; i++) {
        answer.push(num_list.splice(0, n));
    }
    
    return answer;
}
