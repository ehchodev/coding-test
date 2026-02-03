function solution(progresses, speeds) {
    const answer = [];
    
    let i = 0;
    while (i < progresses.length) {
        const addDays = parseInt(Math.ceil( (100 - progresses[i]) / speeds[i] ));
        
        for (let j = i; j < progresses.length; j++) {
            progresses[j] += (speeds[j] * addDays);
        }
        
        let deployCnt = 0;
        for (let k = i; k < progresses.length; k++) {
            if (progresses[k] < 100) break;
            deployCnt++;
        }
        answer.push(deployCnt);
        
        i += deployCnt;
    }
    
    return answer;
}
