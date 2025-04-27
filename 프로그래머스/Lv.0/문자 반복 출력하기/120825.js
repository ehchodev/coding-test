function solution(my_string, n) {
    var answer = '';
    
    my_string.split('').forEach(str => answer += str.repeat(n));
    
    return answer;
}
