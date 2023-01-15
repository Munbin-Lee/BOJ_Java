import java.io.*;

public class BOJ2447 {

    public static char[][] map;

    public static void drawMap(int num, int x, int y) {
        if (num == 1) {
            return;
        }
        for (int i = x-num/6; i <= x+ num / 6; i++) {
            for (int j = y-num/6; j <= y+ num / 6; j++) {
                map[i][j] = ' ';
            }
        }
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i != 0 || j != 0) {
                    drawMap(num / 3, x + num/3 * i, y + num/3 * j);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        map = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = '*';
            }
        }
        drawMap(N, N / 2, N / 2);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                bw.write(map[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
