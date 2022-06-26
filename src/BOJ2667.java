//다시풀기(미완성)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ2667 {

    //동서남북
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};
    public static int[][] map;
    public static int[][] area;
    public static int N;
    public static int numOfArea = 0;
    public static int cnt;
    public static Map<Integer, Integer> areaMap = new HashMap<>();

    public static void setArea(int y, int x, int value) {
        area[y][x] = value;
//        areaMap.put(value, areaMap.get(value) + 1);
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
        N = Integer.parseInt(br.readLine());
        map = new int[N][N]; //y,x
        area = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && area[i][j] == 0) {
                    numOfArea++;
                    cnt=0;
//                    areaMap.put(numOfArea, 0);
                    setArea(j, i, numOfArea);
                    System.out.println(cnt);
                }
            }
        }
        //오름차순 정렬
//        List<Map.Entry<Integer, Integer>> areaList = new LinkedList<>(areaMap.entrySet());
//        areaList.sort(Map.Entry.comparingByValue());
//        for (Map.Entry<Integer, Integer> i : areaList) {
//            System.out.println(i.getValue());
//        }

    }
}
