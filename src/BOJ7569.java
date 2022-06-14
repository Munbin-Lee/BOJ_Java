import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Tomato {
    public int x;
    public int y;
    public int z;

    public Tomato(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class BOJ7569 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());

        int[][][] box = new int[M][N][H]; //x, y, z
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    box[k][j][i] = Integer.parseInt(st.nextToken());
                }
            }
        }

        //위, 아래, 왼쪽, 오른쪽, 앞, 뒤
        int[] dx = {0, 0, -1, 1, 0, 0};
        int[] dy = {0, 0, 0, 0, -1, 1};
        int[] dz = {1, -1, 0, 0, 0, 0};

        int result = 0;
        Deque<Tomato> deque = new ArrayDeque<>();
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[k][j][i] == 1) {
                        for (int l = 0; l < 6; l++) {
                            int nx = k + dx[l];
                            int ny = j + dy[l];
                            int nz = i + dz[l];
                            if (nx < 0 || nx >= M || ny < 0 || ny >= N || nz < 0 || nz >= H) {
                                continue;
                            }
                            if (box[nx][ny][nz] != 0) {
                                continue;
                            }
                            result = 1;
                            box[nx][ny][nz] = 2;
                            deque.addLast(new Tomato(nx, ny, nz));
                        }
                    }
                }
            }

        }

        while (!deque.isEmpty()) {
            Tomato t = deque.removeFirst();
            int x = t.x;
            int y = t.y;
            int z = t.z;
            for (int l = 0; l < 6; l++) {
                int nx = x + dx[l];
                int ny = y + dy[l];
                int nz = z + dz[l];
                if (nx < 0 || nx >= M || ny < 0 || ny >= N || nz < 0 || nz >= H) {
                    continue;
                }
                if (box[nx][ny][nz] != 0) {
                    continue;
                }
                result = box[x][y][z];
                box[nx][ny][nz] = result + 1;
                deque.addLast(new Tomato(nx, ny, nz));
            }
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (box[k][j][i] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
