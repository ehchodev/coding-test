import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] p1 = br.readLine().split(" ");
        String[] p2 = br.readLine().split(" ");
        String[] p3 = br.readLine().split(" ");
        
        String s = "";
        if (p1[0].equals(p2[0])) {
            s += p3[0] + " ";
        } else if (p1[0].equals(p3[0])) {
            s += p2[0] + " ";
        } else {
            s += p1[0] + " ";
        }
        
        if (p1[1].equals(p2[1])) {
            s += p3[1];
        } else if (p1[1].equals(p3[1])) {
            s += p2[1];
        } else {
            s += p1[1];
        }
        
        System.out.print(s);
    }
}
