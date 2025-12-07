function solution(id_list, report, k) {
    const answer = new Array(id_list.length).fill(0);
    
    const reportMap = new Map();
    const countMap = new Map();
    id_list.forEach(id => {
        reportMap.set(id, []);
        countMap.set(id, 0);
    });
    
    const reportSet = new Set(report);
    reportSet.forEach(rs => {
        const r = rs.split(' ');
        reportMap.get(r[0]).push(r[1]);
        countMap.set(r[1], countMap.get(r[1]) + 1);
    });
    
    id_list.forEach((v, i) => {
       countMap.forEach((value, key) => {
           if (value >= k && reportMap.get(v).includes(key)) {
               answer[i]++;
           }
       });
    });
    
    return answer;
}
