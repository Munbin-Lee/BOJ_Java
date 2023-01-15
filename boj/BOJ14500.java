import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14500 {

    public static int N;
    public static int M;
    public static int[][] paper;
    public static boolean[][] visited;
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};
    public static int max = -1;

    public static void dfs(int y, int x, int depth, int sum) {
        if (depth == 4) {
            max = Math.max(max, sum);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny == -1 || ny == N || nx == -1 || nx == M || visited[ny][nx]) {
                continue;
            }
            visited[ny][nx] = true;
            dfs(ny, nx, depth + 1, sum + paper[ny][nx]);
            visited[ny][nx] = false;
        }
    }

    public static void check(int y, int x) {
        int wing = 4;
        int min = Integer.MAX_VALUE;
        int sum = paper[y][x];
        for (int i = 0; i < 4; i++) {
            if (wing <= 2) {
                return;
            }
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny == -1 || ny == N || nx == -1 || nx == M) {
                wing--;
                continue;
            }
            min = Math.min(min, paper[ny][nx]);
            sum += paper[ny][nx];
        }
        if (wing == 4) {
            sum -= min;
        }
        max = Math.max(max, sum);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //y
        M = Integer.parseInt(st.nextToken()); //x
        paper = new int[N][M];
        visited = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                dfs(i, j, 0, 0);
                check(i, j);
            }
        }
        System.out.println(max);
    }
}
