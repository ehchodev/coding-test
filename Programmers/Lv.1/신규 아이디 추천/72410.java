class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^a-z0-9._-]+", "");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        new_id = ("".equals(new_id)) ? "a" : new_id;
        new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;
        new_id = (new_id.substring(new_id.length() - 1).equals(".")) ? new_id.substring(0, new_id.length() - 1) : new_id;
        new_id = (new_id.length() <= 3) ? (new_id + new_id.substring(new_id.length() - 1).repeat(3)).substring(0, 3) : new_id;
        
        answer = new_id;
        
        return answer;
    }
}
