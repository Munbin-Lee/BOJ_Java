import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ2178 {

    public static int N;
    public static int M;
    public static boolean[][] map;
    public static boolean[][] visited;

    private static class Info {
        public int y;
        public int x;
        public int cnt;

        public Info(int y, int x, int cnt) {
            this.y = y;
            this.x = x;
            this.cnt = cnt;
        }
    }

    public static int bfs() {
        //동서남북
        int[] dy = {0, 0, 1, -1};
        int[] dx = {1, -1, 0, 0};

        Deque<Info> deque = new ArrayDeque<>();
        deque.addLast(new Info(0, 0, 1));

        while (!deque.isEmpty()) {
            Info info = deque.removeFirst();
            int y = info.y;
            int x = info.x;
            int cnt = info.cnt;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny == -1 || ny == N || nx == -1 || nx == M || visited[ny][nx] || !map[ny][nx]) {
                    continue;
                }
                visited[ny][nx] = true;
                if (ny == N - 1 && nx == M - 1) {
                    return cnt + 1;
                }
                deque.addLast(new Info(ny, nx, cnt + 1));
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new boolean[N][M]; //y,x
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = (line.charAt(j) == '1');
            }
        }

        System.out.println(bfs());
    }
}
