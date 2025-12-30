function solution(clothes) {
    let answer = 1;
    
    const obj = {};
    clothes.forEach(arr => {
       obj[arr[1]] = (obj[arr[1]] || 0) + 1; 
    });
    
    Object.keys(obj).forEach(key => {
        answer *= obj[key] + 1;
    });
    
    answer--;
    
    return answer;
}
