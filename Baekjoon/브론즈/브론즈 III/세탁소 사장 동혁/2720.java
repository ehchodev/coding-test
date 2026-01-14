import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int quarter = 25, dime = 10, nickel = 5, penny = 1;
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int change = Integer.parseInt(br.readLine());
            sb.append(change / quarter).append(" ");
            
            change %= quarter;
            sb.append(change / dime).append(" ");
            
            change %= dime;
            sb.append(change / nickel).append(" ");
            
            change %= nickel;
            sb.append(change).append("\n");
        }
        
        System.out.print(sb);
    }
}
