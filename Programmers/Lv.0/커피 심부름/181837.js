function solution(order) {
    let answer = 0;
    
    order.forEach(v => answer += (v.includes('cafelatte')) ? 5000 : 4500);
    
    return answer;
}
