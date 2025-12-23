function solution(want, number, discount) {
    let answer = 0;
    
    const list = [];
    for (let i = 0; i < want.length; i++) {
        for (let j = 1; j <= number[i]; j++) {
            list.push(want[i]);
        }
    }
    
    for (let i = 0; i <= discount.length - 10; i++) {
        const list2 = [...list];
        for (let j = i; j < i + 10; j++) {
            if (list2.includes(discount[j])) {
                list2.splice(list2.indexOf(discount[j]), 1);
                
                if (list2.length === 0) {
                    answer++;
                }
            }
        }
    }
    
    return answer;
}
