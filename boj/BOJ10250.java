import java.io.*;
import java.util.StringTokenizer;

public class BOJ10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st.nextToken());
            @SuppressWarnings("unused")
            int W = Integer.parseInt(st.nextToken()); //사용X
            int N = Integer.parseInt(st.nextToken());
            int floor = (N % H == 0) ? H : N % H;
            int room = (N - floor) / H + 1;
            bw.write(floor * 100 + room + "\n");
        }
        bw.flush();
        bw.close();
    }
}
