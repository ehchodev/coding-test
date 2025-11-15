function solution(answers) {
    const answer = [];
    
    const arr1 = [1, 2, 3, 4, 5];
    const arr2 = [2, 1, 2, 3, 2, 4, 2, 5];
    const arr3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    
    const score = [0, 0, 0];
    answers.forEach((v, i) => {
        if (arr1[i % arr1.length] === v) score[0]++;
        if (arr2[i % arr2.length] === v) score[1]++;
        if (arr3[i % arr3.length] === v) score[2]++;
    });
    
    const max = Math.max(...score);
    score.forEach((v, i) => {
        if (v === max) answer.push(i + 1);
    })
    
    return answer;
}
