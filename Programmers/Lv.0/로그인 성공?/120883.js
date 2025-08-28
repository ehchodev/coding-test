function solution(id_pw, db) {
    let answer = "fail";
    
    const [id, pw] = id_pw;
    db.forEach(arr => {
        if (id === arr[0]) {
            if (pw === arr[1]) {
                answer = "login";
                return;
            }
            
            answer = "wrong pw";
        }
    });
    
    return answer;
}
