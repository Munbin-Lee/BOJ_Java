import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ23301 {

    public static int N;
    public static boolean[][] arr;

    public static int chk(int start, int end) {
        int satis = 0;
        for (int i = 0; i < N; i++) {
            for (int j = start; j < end; j++) {
                if (arr[i][j]) satis++;
            }
        }
        return satis;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int maxEnd = 0;

        // [사람번호][가능한 시간]
        arr = new boolean[N][1000];
        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            while (K-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                maxEnd = Math.max(maxEnd, end);
                for (int j = start; j < end; j++) {
                    arr[i][j] = true;
                }
            }
        }

        int maxChk = 0;
        int res = 0;
        for (int i = 0; i + T <= maxEnd; i++) {
            int chk = chk(i, i + T);
            if (chk > maxChk) {
                maxChk = chk;
                res = i;
            }
        }
        System.out.printf("%d %d", res, res + T);
    }
}
