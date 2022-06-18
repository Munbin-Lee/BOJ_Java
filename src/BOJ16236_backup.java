//다시풀기(미완성)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class BOJ16236_backup {

    public static int N;
    public static int[][] map;
    public static int size;
    public static int y;
    public static int x;

    //동서남북
    public static int[] dy = {0, 0, 1, -1};
    public static int[] dx = {1, -1, 0, 0};


    private static class Info {
        public int y;
        public int x;
        public int time;

        public Info(int y, int x, int time) {
            this.y = y;
            this.x = x;
            this.time = time;
        }
    }

    public static Info findNearestEatableFish() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (size > map[i][j] && map[i][j] > 0) {
                    int time = timeToMoveTo(i, j);
                    if (time != -1) {
                        return new Info(i, j, time);
                    }
                }
            }
        }
        return new Info(-1, -1, -1);
    }

    public static int timeToMoveTo(int ty, int tx) {
        boolean[][] visited = new boolean[N][N];
        visited[y][x] = true;
        Deque<Info> deque = new ArrayDeque<>();
        deque.addLast(new Info(y, x, 0));
        while (!deque.isEmpty()) {
            Info info = deque.removeFirst();
            for (int i = 0; i < 4; i++) {
                int ny = info.y + dy[i];
                int nx = info.x + dx[i];
                if (ny == -1 || ny == N || nx == -1 || nx == N || visited[ny][nx] || map[ny][nx] > size) {
                    continue;
                }
                int time = info.time + 1;
                if (ny == ty && nx == tx) {
                    return time;
                }
                deque.addLast(new Info(ny, nx, time));
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N]; //y,x
        size = 2; //상어의 사이즈
        int fishToSizeUp = 2; //성장하기 위해 필요한 물고기의 수
        int time = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 9) {
                    y = i;
                    x = j;
                }
                else {
                    map[i][j] = num;
                }
            }
        }

        while (true) {
            Info info = findNearestEatableFish();
            if (info.y == -1) {
                break;
            }
            if (size == map[info.y][info.x]) {
                fishToSizeUp--;
                if (fishToSizeUp == 0) {
                    size++;
                    fishToSizeUp = size;
                }
            }
            map[info.y][info.x] = 0;
            y = info.y;
            x = info.x;
            time += info.time;
        }
        System.out.println(time);
    }
}
