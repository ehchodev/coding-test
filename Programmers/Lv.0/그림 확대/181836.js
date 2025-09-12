function solution(picture, k) {
    const answer = [];
    
    for (let a=0; a<picture.length; a++) {
        const str = picture[a].split('');
        let s = '';
        
        str.forEach((v, i) => s += v.repeat(k));
        
        for (let b=0; b<k; b++) answer[(a * k) + b] = s;
    }
    
    return answer;
}
