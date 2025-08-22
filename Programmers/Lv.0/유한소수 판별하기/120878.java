class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        String astr = "";
        for (int i=2; i<=a; i++) {
            if (a % i == 0) {
                astr += i + ",";
                a /= i;
                i = 1;
            }
        }
        
        String bstr = "";
        for (int j=2; j<=b; j++) {
            if (b % j == 0) {
                bstr += j + ",";
                b /= j;
                j = 1;
            }
        }
        
        String[] alist = astr.split(",");
        String[] blist = bstr.split(",");
        for (int k=0; k<alist.length; k++) {
            for (int l=0; l<blist.length; l++) {
                if (alist[k].equals(blist[l])) {
                    alist[k] = "0";
                    blist[l] = "0";
                    break;
                }
            }
        }
        
        for (String s : blist) {
            if (!"0".equals(s) && !"2".equals(s) && !"5".equals(s)) {
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}
