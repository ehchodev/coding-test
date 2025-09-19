function solution(num_list) {
    let answer = 0;
    
    let even = 0, odd = 0;
    num_list.forEach((v, i) => (i % 2 === 0) ? even += v : odd += v);
    
    answer = (even > odd) ? even : odd;
    
    return answer;
}
