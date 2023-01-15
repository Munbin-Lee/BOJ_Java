import java.io.*;
import java.util.StringTokenizer;

public class BOJ1009 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()) % 10;
            int b = Integer.parseInt(st.nextToken());
            int result = 1;

            while (b-- > 0) {
                result = a * result % 10;
            }
            if (result == 0) {
                result = 10;
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
