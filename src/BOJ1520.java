//WAP 제출용
//Special Thanks to Taeho!
//다시풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1520 {

    private static int M, N;
    private static int[][] map;
    private static int[][] numOfDirections;

    public static int GetNumOfDirections(int y, int x) {
        if (y == M - 1 && x == N - 1) { //도착
            return 1;
        }
        if (numOfDirections[y][x] != -1) {
            return numOfDirections[y][x];
        }

        numOfDirections[y][x] = 0;
        if ((y - 1 >= 0) && (map[y - 1][x] < map[y][x])) { //상
            numOfDirections[y][x] += GetNumOfDirections(y - 1, x);
        }
        if ((y + 1 < M) && (map[y + 1][x] < map[y][x])) { //하
            numOfDirections[y][x] += GetNumOfDirections(y + 1, x);
        }
        if ((x - 1 >= 0) && (map[y][x - 1] < map[y][x])) { //좌
            numOfDirections[y][x] += GetNumOfDirections(y, x - 1);
        }
        if ((x + 1 < N) && (map[y][x + 1] < map[y][x])) { //우
            numOfDirections[y][x] += GetNumOfDirections(y, x + 1);
        }
        return numOfDirections[y][x];

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        M = Integer.parseInt(st.nextToken()); //세로
        N = Integer.parseInt(st.nextToken()); //가로
        map = new int[M][N];
        numOfDirections = new int[M][N]; //x, y가 종점까지 가는 경우의 수
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                numOfDirections[i][j] = -1; //정보없음
            }
        }
        System.out.println(GetNumOfDirections(0, 0));

    }
}
