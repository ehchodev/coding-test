import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        
        int time = (hour * 60) + minute - 45;
        if (time < 0) time += (24 * 60);
        hour = time / 60;
        minute = time % 60;
        
        System.out.println(hour + " " + minute);
    }
}
