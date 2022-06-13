//다시풀기 (시간초과)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7569 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int[][][] box = new int[M][N][H];
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
        boolean loop = true;
        while (loop) {
            loop = false;
            result++;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < M; k++) {
                        if (box[k][j][i] == result) {
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
                                box[nx][ny][nz] = result + 1;
                                loop = true;
                            }
                        }
                    }
                }
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
        System.out.println(result - 1);
    }
}
