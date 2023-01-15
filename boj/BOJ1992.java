import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1992 {

    public static int[][] video;

    public static int isAllSame(int size, int y, int x) {
        int target = video[y][x];
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (target != video[i][j]) {
                    return -1;
                }
            }

        }
        return target;
    }

    public static StringBuilder compress(int size, int y, int x) {
        int num = isAllSame(size, y, x);
        if (num == -1) {
            return new StringBuilder("(")
                    .append(compress(size / 2, y, x))
                    .append(compress(size / 2, y, x + size / 2))
                    .append(compress(size / 2, y + size / 2, x))
                    .append(compress(size / 2, y + size / 2, x + size / 2))
                    .append(")");
        }
        return new StringBuilder(Integer.toString(num));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        video = new int[N][N]; //y,x
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                video[i][j] = line.charAt(j) - '0';
            }
        }
        System.out.println(compress(N, 0, 0));
    }
}
