import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class BOJ7576 {

    public static int M;
    public static int N;
    public static int[][] box;

    private static class Pos {
        public int y;
        public int x;

        public Pos(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static int bfs() {
        int[] dy = {0, 0, 1, -1};
        int[] dx = {1, -1, 0, 0};

        ArrayDeque<Pos> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 1) {
                    deque.addLast(new Pos(i, j));
                }
            }
        }

        int day = 0;
        while (!deque.isEmpty()) {
            Pos pos = deque.removeFirst();
            int y = pos.y;
            int x = pos.x;
            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (ny == -1 || ny == N || nx == -1 || nx == M || box[ny][nx] != 0) {
                    continue;
                }
                day = box[y][x];
                box[ny][nx] = day + 1;
                deque.addLast(new Pos(ny, nx));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) {
                    return -1;
                }
            }
        }
        return day;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken()); //x
        N = Integer.parseInt(st.nextToken()); //y
        box = new int[N][M]; //y,x
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(bfs());
    }
}