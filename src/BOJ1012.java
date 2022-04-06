import java.io.*;
import java.util.StringTokenizer;

public class BOJ1012 {

    public static int M, N;
    public static boolean[][] map;
    public static boolean[][] check;
    public static final int[] dx = {0, 0, -1, 1};
    public static final int[] dy = {-1, 1, 0, 0};

    public static void chkMap(int x, int y) {
        check[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int _x = x + dx[i];
            int _y = y + dy[i];
            if (_x >= 0 && _x < M && _y >= 0 && _y < N && map[_x][_y] && !check[_x][_y]) {
                chkMap(_x, _y);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            map = new boolean[M][N];
            check = new boolean[M][N];

            while (K-- > 0) {
                st = new StringTokenizer(br.readLine(), " ");
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());
                map[num1][num2] = true;
            }

            int cnt = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (map[i][j] && !check[i][j]) {
                        chkMap(i, j);
                        cnt++;
                    }
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}
