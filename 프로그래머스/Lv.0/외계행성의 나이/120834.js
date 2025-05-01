function solution(age) {
    let answer = '';
    
    const alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'];
    while (age > 0) {
        answer = alphabet[age % 10] + answer;
        age = parseInt(age / 10);
    }
    
    return answer;
}
