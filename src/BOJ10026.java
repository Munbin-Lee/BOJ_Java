import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10026 {

    public static int N;
    public static char[][] imageHuman;
    public static char[][] imageCow;
    public static boolean[][] visited;
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};

    public static void dfs(int y, int x, char[][] arr) {
        char target = arr[y][x];
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny == -1 || ny == N || nx == -1 || nx == N || visited[ny][nx] || target != arr[ny][nx]) {
                continue;
            }
            visited[ny][nx] = true;
            dfs(ny, nx, arr);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        imageHuman = new char[N][N];
        imageCow = new char[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                imageHuman[i][j] = line.charAt(j);
                if (line.charAt(j) == 'G') {
                    imageCow[i][j] = 'R';
                }
                else {
                    imageCow[i][j] = line.charAt(j);
                }
            }
        }
        visited = new boolean[N][N];
        int areaOfHuman = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) {
                    continue;
                }
                dfs(i, j, imageHuman);
                areaOfHuman++;
            }
        }
        visited = new boolean[N][N];
        int areaOfCow = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (visited[i][j]) {
                    continue;
                }
                dfs(i, j, imageCow);
                areaOfCow++;
            }
        }
        System.out.println(areaOfHuman + " " + areaOfCow);
    }
}
