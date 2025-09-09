function solution(quiz) {
    const answer = [];
    
    for (let i=0; i<quiz.length; i++) {
        const [X, operator, Y, equal, Z] = quiz[i].split(' ');
        const sign = (operator === '+') ? 1 : -1;
        answer[i] = (Number(X) + (sign * Number(Y)) === Number(Z)) ? 'O' : 'X';
    }
    
    return answer;
}
