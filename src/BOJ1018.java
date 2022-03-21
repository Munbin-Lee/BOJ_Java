import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 {

    public static char[][] map;

    public static int count(int X, int Y) {
        int cntB = 0; //B로 시작할 때
        int cntW = 0; //W로 시작할 때
        for (int i = 0; i < 8; i++) {
            char desiredCharB = (i % 2 == 0) ? 'B' : 'W';
            char desiredCharW = (i % 2 == 0) ? 'W' : 'B';
            for (int j = 0; j < 8; j++) {
                if (map[X + i][Y + j] != desiredCharB) {
                    cntB++;
                }
                if (map[X + i][Y + j] != desiredCharW) {
                    cntW++;
                }
                desiredCharB = (desiredCharB == 'B') ? 'W' : 'B';
                desiredCharW = (desiredCharW == 'B') ? 'W' : 'B';
            }
        }
        return Math.min(cntB, cntW);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i + 8 <= N; i++) {
            for (int j = 0; j + 8 <= M; j++) {
                min = Math.min(min, count(i, j));
            }
        }
        System.out.println(min);
    }
}