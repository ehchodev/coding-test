function solution(friends, gifts) {
    let answer = 0;
    
    const indexObj = {};
    const countArr = [], giftArr = [];
    friends.forEach((v, i) => {
        indexObj[v] = i;
        countArr.push(0);
        giftArr.push(Array(friends.length).fill(0));
    });
    
    gifts.forEach(v => {
        const [g1, g2] = v.split(' ');
        countArr[indexObj[g1]]++;
        countArr[indexObj[g2]]--;
        giftArr[indexObj[g1]][indexObj[g2]]++;
    });
    
    for (let i = 0; i < giftArr.length; i++) {
        let count = 0;
        
        for (let j = 0; j < giftArr.length; j++) {
            if (i === j) continue;
            
            if (giftArr[i][j] > giftArr[j][i]) {
                count++;
            } else if (giftArr[i][j] === giftArr[j][i]) {
                if (countArr[i] > countArr[j]) {
                    count++;
                }
            }
            
            answer = Math.max(answer, count);
        }
    }
    
    return answer;
}
