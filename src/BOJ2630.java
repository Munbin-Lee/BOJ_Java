import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2630 {

    public static int[] cnt = new int[2];
    public static int[][] paper;

    public static boolean isAllSame(int y, int x, int size) {
        int target = paper[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (target != paper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void cutPaper(int y, int x, int size) {
        if (isAllSame(y, x, size)) {
            cnt[paper[y][x]]++;
        }
        else {
            cutPaper(y, x, size / 2);
            cutPaper(y, x + size / 2, size / 2);
            cutPaper(y + size / 2, x, size / 2);
            cutPaper(y + size / 2, x + size / 2, size / 2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N]; //y,x
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cutPaper(0, 0, N);
        System.out.println(cnt[0]);
        System.out.println(cnt[1]);
    }
}
