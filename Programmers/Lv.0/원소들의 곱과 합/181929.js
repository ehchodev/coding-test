function solution(num_list) {
    let answer = 0;
    
    let m = 1, s = 0;
    for (const num of num_list) {
        m *= num;
        s += num;
    }
    
    answer = (m < s**2) ? 1 : 0;
    
    return answer;
}
