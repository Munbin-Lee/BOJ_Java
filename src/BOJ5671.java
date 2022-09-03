import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ5671 {

    public static boolean isRepeated(int num) {
        // 0~9 나온 횟수 체크용 배열
        int[] cnt = new int[10];
        for (int i = num; i > 0; i /= 10) {
            cnt[i % 10]++;
            if (cnt[i % 10] == 2) return true;
        }
        return false;
    }

    public static int solve(int N, int M) {
        int cnt = 0;
        for (int i = N; i <= M; i++) {
            if (!isRepeated(i)) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (String line = br.readLine(); line != null; line = br.readLine()) {
            StringTokenizer st = new StringTokenizer(line, " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            sb.append(solve(N, M)).append('\n');
        }
        System.out.println(sb);
    }
}
