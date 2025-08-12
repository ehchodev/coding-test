function solution(polynomial) {
    let answer = '';
    
    let num1 = 0, num2 = 0;
    polynomial.split(" + ").forEach(v => {
       if (v.indexOf("x") > -1) {
           num1 += (v === "x") ? 1 : Number(v.split("x")[0]);
       } else {
           num2 += Number(v);
       }
    });
    
    answer += num1 > 0 ? (num1 > 1 ? num1 : "") + "x" : "";
    answer += num2 > 0 ? (num1 > 0 ? " + " : "") + num2 : "";
    
    return answer;
}
