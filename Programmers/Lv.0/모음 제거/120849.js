function solution(my_string) {
    let answer = my_string;
    const arr = ['a', 'e', 'i', 'o', 'u'];
    
    arr.forEach(v => {
       answer = answer.replaceAll(v, ''); 
    });
    
    return answer;
}
