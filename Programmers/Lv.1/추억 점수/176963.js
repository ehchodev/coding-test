function solution(name, yearning, photo) {
    const answer = [];
    
    photo.forEach(names => {
        const score = names.map(n => name.includes(n) ? yearning[name.indexOf(n)] : 0)
                           .reduce((acc, cur) => acc + cur);
        answer.push(score);
    });
    
    return answer;
}
