function solution(my_string, n) {
    let answer = '';
    
    my_string.split('').forEach(str => answer += str.repeat(n));
    
    return answer;
}
