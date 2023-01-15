import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1780 {

    public static int N;
    public static int[][] paper;
    public static boolean[][] checked;
    public static int[] numOfPaper = new int[3]; //-1,0,1

    public static boolean isAllSame(int y, int x, int y2, int x2) {
        int target = paper[y][x];
        for (int i = y; i < y2; i++) {
            for (int j = x; j < x2; j++) {
                if (target != paper[i][j]) {
                    return false;
                }
            }
        }
        numOfPaper[target + 1]++;
        return true;
    }

    public static void check(int y, int x, int y2, int x2) {
        for (int i = y; i < y2; i++) {
            for (int j = x; j < x2; j++) {
                checked[i][j] = true;
            }
        }
    }

    public static boolean isAllChecked(int size) {
        for (int i = 0; i < N; i += size) {
            for (int j = 0; j < N; j += size) {
                if (!checked[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void cutPaper(int size) {
        for (int i = 0; i < N; i += size) {
            for (int j = 0; j < N; j += size) {
                if (checked[i][j]) {
                    continue;
                }
                if (isAllSame(i, j, i + size, j + size)) {
                    check(i, j, i + size, j + size);
                }
            }
        }
        if (!isAllChecked(size)) {
            cutPaper(size / 3);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        paper = new int[N][N]; //y,x
        checked = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                paper[i][j] = num;
            }
        }

        cutPaper(N);
        for (int i : numOfPaper) {
            System.out.println(i);
        }

    }
}
