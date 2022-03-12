import java.io.*;
import java.util.StringTokenizer;

public class BOJ10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[20000001]; //-10000000~10000000
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken()) + 10000000; //-10000000->0
            cnt[num]++;
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        while (M-- > 0) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(cnt[num + 10000000] + " ");
        }
        bw.flush();
        bw.close();
    }
}