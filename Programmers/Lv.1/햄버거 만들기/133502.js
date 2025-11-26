function solution(ingredient) {
    let answer = 0;
    
    for (let i = 0; i < ingredient.length; i++) {
        const arr = ingredient.slice(i, i + 4);
        
        if (arr[0] === 1 && arr[1] === 2 && arr[2] === 3 && arr[3] === 1) {
            answer++;
            ingredient.splice(i, 4);
            i = Math.max(-1, i - 3);
        }
    }
    
    return answer;
}
