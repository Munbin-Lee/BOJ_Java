//WAP 제출용
//Special Thanks to Taeho!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1520 {

    private static int M, N;
    private static int[][] map;
    private static int[][] numOfDirections;
    private static final int[] dy = {1, -1, 0, 0};
    private static final int[] dx = {0, 0, 1, -1};

    public static int getNumOfDirections(int y, int x) {
        if (y == M - 1 && x == N - 1) return 1; //도착
        if (numOfDirections[y][x] != -1) return numOfDirections[y][x];
        numOfDirections[y][x] = 0;

        for (int i = 0; i < 4; i++) {
            int _y = y + dy[i], _x = x + dx[i];
            if (_y >= M || _y < 0 || _x >= N || _x < 0) continue;
            if (map[_y][_x] < map[y][x]) numOfDirections[y][x] += getNumOfDirections(_y, _x);
        }
        return numOfDirections[y][x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken()); //세로
        N = Integer.parseInt(st.nextToken()); //가로
        map = new int[M][N];
        numOfDirections = new int[M][N]; //y, x가 종점까지 가는 경우의 수

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                numOfDirections[i][j] = -1; //정보없음
            }
        }
        System.out.println(getNumOfDirections(0, 0));
    }
}
