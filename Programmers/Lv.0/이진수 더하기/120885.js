function solution(bin1, bin2) {
    let answer = '';
    
    const len1 = bin1.length;
    const len2 = bin2.length;
    const maxlen = Math.max(len1, len2) + 1;
    
    const arr1 = new Array(maxlen).fill(0);
    const arr2 = new Array(maxlen).fill(0);
    for (let i=0; i<maxlen; i++) {
        if (len1 > i) arr1[i] = Number(bin1.split('')[len1-1-i]);
        if (len2 > i) arr2[i] = Number(bin2.split('')[len2-1-i]);
    }
    
    const sumarr = new Array(maxlen).fill(0);
    let sum = 0;
    for (let j=0; j<maxlen; j++) {
        sum = sumarr[j] + arr1[j] + arr2[j];
        if (sum > 0) sumarr[j] = Math.abs(2 - sum);
        if (sum >= 2) sumarr[j+1] = 1;
    }
    console.log(sumarr);
    
    sumarr.forEach(num => answer = num + answer);
    if (answer.charAt(0) === '0') answer = answer.substr(1);
    
    return answer;
}
