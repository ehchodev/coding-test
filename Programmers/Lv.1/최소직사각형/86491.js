function solution(sizes) {
    let answer = 0;
    
    let maxW = Math.max(...sizes[0]);
    let maxH = Math.min(...sizes[0]);
    for (const size of sizes) {
        const [w, h] = [Math.max(...size), Math.min(...size)];
        if (w > maxW) maxW = w;
        if (h > maxH) maxH = h;
    }
    
    answer = maxW * maxH;
    
    return answer;
}
