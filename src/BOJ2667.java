import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ2667 {

    //동서남북
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};
    public static int[][] map;
    public static int[][] area;
    public static int N;
    public static int numOfArea = 0;
    public static int cnt;

    public static void setArea(int y, int x, int value) {
        area[y][x] = value;
        cnt++;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny == -1 || ny == N || nx == -1 || nx == N || map[ny][nx] == 0 || area[ny][nx] != 0) {
                continue;
            }
            setArea(ny, nx, value);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N]; //y,x
        area = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && area[i][j] == 0) {
                    numOfArea++;
                    cnt = 0;
                    setArea(i, j, numOfArea);
                    list.add(cnt);
                }
            }
        }

        bw.write(numOfArea + "\n");
        Collections.sort(list);
        for (int i : list) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
