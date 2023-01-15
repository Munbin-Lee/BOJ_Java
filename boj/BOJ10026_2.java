import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10026_2 {

    public static int N;
    public static char[][] image;
    public static boolean[][] visited;
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};

    public static void dfs(int y, int x) {
        visited[y][x] = true;
        char target = image[y][x];
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny == -1 || ny == N || nx == -1 || nx == N || visited[ny][nx] || target != image[ny][nx]) {
                continue;
            }
            dfs(ny, nx);
        }
    }

    public static int solve() {
        visited = new boolean[N][N];
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) {
                    continue;
                }
                dfs(i, j);
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        image = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                image[i][j] = line.charAt(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(solve()).append(" ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (image[i][j] == 'G') {
                    image[i][j] = 'R';
                }
            }
        }
        sb.append(solve());
        System.out.println(sb);
    }
}
