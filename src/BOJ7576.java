import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ7576 {

    private static class Tomato {
        public int x;
        public int y;

        public Tomato(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] box = new int[M][N]; //x, y
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                box[j][i] = Integer.parseInt(st.nextToken());
            }
        }


        //동, 서, 남, 북
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        int result = 0;
        Deque<Tomato> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[j][i] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int nx = j + dx[k];
                        int ny = i + dy[k];
                        if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                            continue;
                        }
                        if (box[nx][ny] != 0) {
                            continue;
                        }
                        result = 1;
                        box[nx][ny] = 2;
                        deque.addLast(new Tomato(nx, ny));
                    }
                }
            }

        }

        while (!deque.isEmpty()) {
            Tomato t = deque.removeFirst();
            int x = t.x;
            int y = t.y;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N) {
                    continue;
                }
                if (box[nx][ny] != 0) {
                    continue;
                }
                result = box[x][y];
                box[nx][ny] = result + 1;
                deque.addLast(new Tomato(nx, ny));
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[j][i] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(result);
    }
}
