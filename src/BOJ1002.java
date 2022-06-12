import java.io.*;
import java.util.StringTokenizer;

public class BOJ1002 {

    public static int getNumOfLocations(int x1, int y1, int r1, int x2, int y2, int r2) {
        double distancePow = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        if (x1 == x2 && y1 == y2 && r1 == r2) { // 두 원이 겹치는 경우 (교점이 무한)
            return -1;
        }
        if (distancePow > Math.pow(r1 + r2, 2)) { // 두 원이 만나지 않음
            return 0;
        }
        if (distancePow < Math.pow(r2 - r1, 2)) { // 한 원이 다른 원을 포함
            return 0;
        }
        if (distancePow == Math.pow(r2 - r1, 2)) { // 두 원이 외접
            return 1;
        }
        if (distancePow == Math.pow(r1 + r2, 2)) { // 두 원이 내접
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            bw.write(getNumOfLocations(x1, y1, r1, x2, y2, r2) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
