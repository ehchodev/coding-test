import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int x = 1, y = 1;
        int max = 1;
        for (int i = 1; i < N; i++) {
            if (max % 2 == 0) {
                if (y == 1) {
                    max++;
                    x = max;
                    y = 1;
                } else {
                    x++;
                    y--;
                }
            
            } else {
                if (x == 1) {
                    max++;
                    x = 1;
                    y = max;
                } else {
                    x--;
                    y++;
                }
            }
        }
        
        System.out.print(x + "/" + y);
    }
}
