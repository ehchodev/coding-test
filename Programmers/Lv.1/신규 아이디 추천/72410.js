function solution(new_id) {
    let answer = '';
    
    new_id = new_id.toLowerCase();
    new_id = new_id.replace(/[^a-z0-9._-]/g, "");
    new_id = new_id.replace(/\.{2,}/g, ".");
    new_id = new_id.replace(/^\.|\./g, "");
    new_id = (new_id === "") ? "a" : new_id;
    new_id = (new_id.length >= 16) ? new_id.slice(0, 15) : new_id;
    new_id = (new_id.slice(-1) === ".") ? new_id.slice(0, -1) : new_id;
    new_id = (new_id.length <= 3) ? (new_id + new_id.slice(-1).repeat(3)).slice(0, 3) : new_id;
    
    answer = new_id;
    
    return answer;
}
