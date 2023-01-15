import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ16236 {

    public static int N;
    public static int[][] map;
    public static int size;
    public static int y;
    public static int x;

    //상, 좌, 우, 하
    public static int[] dy = {-1, 0, 0, 1};
    public static int[] dx = {0, -1, 1, 0};


    private static class Info implements Comparable<Info> {
        public int y;
        public int x;
        public int time;

        public Info(int y, int x, int time) {
            this.y = y;
            this.x = x;
            this.time = time;
        }

        //시간 적은 순 -> y 작은 순 -> x 작은 순
        @Override
        public int compareTo(Info info) {
            if (this.time == info.time) {
                if (this.y == info.y) {
                    return Integer.compare(this.x, info.x);
                }
                return Integer.compare(this.y, info.y);
            }
            return Integer.compare(this.time, info.time);
        }
    }

    //가장 가까운 먹을 수 있는 물고기를 bfs로 구함
    public static PriorityQueue<Info> findNearestEatableFish() {
        PriorityQueue<Info> pq = new PriorityQueue<>();
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
                visited[ny][nx] = true;
                int time = info.time + 1;
                if (size > map[ny][nx] && map[ny][nx] > 0) {
                    pq.add(new Info(ny, nx, time));
                }
                deque.addLast(new Info(ny, nx, time));
            }
        }
        return pq;
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
            PriorityQueue<Info> pq = findNearestEatableFish();
            if (pq.isEmpty()) {
                break;
            }
            Info info = pq.poll();
            if (--fishToSizeUp == 0) {
                size++;
                fishToSizeUp = size;
            }
            map[info.y][info.x] = 0;
            y = info.y;
            x = info.x;
            time += info.time;
        }
        System.out.println(time);
    }
}
