class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        
        int x = 0, y = 0;
        for (int i = 0; i < park.length; i++) {
            int index = park[i].indexOf("S");
            if (index > -1) {
                x = i;
                y = index;
                break;
            }
        }
        
        for (String route : routes) {
            String[] r = route.split(" ");
            String op = r[0];
            int n = Integer.parseInt(r[1]);
            
            boolean moveFlag = true;
            for (int m = 1; m <= n; m++) {
                if ("N".equals(op)) {
                    moveFlag = (x - n >= 0 && park[x - m].charAt(y) != 'X');
                
                } else if ("S".equals(op)) {
                    moveFlag = (x + n < park.length && park[x + m].charAt(y) != 'X');

                } else if ("W".equals(op)) {
                    moveFlag = (y - n >= 0 && park[x].charAt(y - m) != 'X');
                    
                } else if ("E".equals(op)) {
                    moveFlag = (y + n < park[x].length() && park[x].charAt(y + m) != 'X');
                }
                
                if (!moveFlag) break;
            }
            
            if (moveFlag) {
                if ("N".equals(op)) x -= n;
                else if ("S".equals(op)) x += n;
                else if ("W".equals(op)) y -= n;
                else if ("E".equals(op)) y += n;
            }
        }
        
        answer = new int[] {x, y};
        
        return answer;
    }
}
