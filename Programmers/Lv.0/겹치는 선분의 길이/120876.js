function solution(lines) {
    let answer = 0;
    
    const obj = {};
    
    const arr1 = [], arr2 = [], arr3 = [];
    for (let i1=lines[0][0]; i1<lines[0][1]; i1++) {
        const key1 = i1 + "," + (i1+1);
        arr1.push(key1);
        obj[key1] = (obj[key1] || 0) + 1;
    }
    for (let i2=lines[1][0]; i2<lines[1][1]; i2++) {
        const key2 = i2 + "," + (i2+1);
        arr2.push(key2);
        obj[key2] = (obj[key2] || 0) + 1;
    }
    for (let i3=lines[2][0]; i3<lines[2][1]; i3++) {
        const key3 = i3 + "," + (i3+1);
        arr3.push(key3);
        obj[key3] = (obj[key3] || 0) + 1;
    }

    for (const key in obj) {
        if (obj[key] > 1) answer++;
    }
    
    return answer;
}
