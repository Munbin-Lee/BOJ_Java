//다시풀기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ18111 {

    public static int[][] map;
    public static int N; //세로
    public static int M; //가로
    public static int B; //인벤토리 내 초기 블록 수

    public static int getTimeFlattening(int desiredLevel) {
        int time = 0;
        int numOfBlocks = B;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int currentLevel = map[i][j];
                int differ = desiredLevel - currentLevel;
                if (differ > 0) { //블록 생성
                    time += differ;
                    numOfBlocks -= differ;
                }
                if (differ < 0) { //블록 제거
                    differ *= -1;
                    time += 2 * differ;
                    numOfBlocks += differ;
                }
            }
        }
        if (numOfBlocks < 0) {
            time = Integer.MAX_VALUE;
        }
        return time;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        int max = 0;
        int min = 256;

        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int num = Integer.parseInt(st.nextToken());
                map[i][j] = num;
                max = Math.max(max, num);
                min = Math.min(min, num);
            }
        }

        int minTime = Integer.MAX_VALUE;
        int level = 0;
        for (int i = min; i <= max; i++) {
            int time = getTimeFlattening(i);
            if (time < minTime) {
                minTime = time;
                level = i;
            }
        }
        System.out.printf("%d %d", minTime, level);
    }
}
