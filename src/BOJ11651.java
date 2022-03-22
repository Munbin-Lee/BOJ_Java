import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ11651 {

    public static class Point {
        public final int x;
        public final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Point[] arr = new Point[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i] = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1.y == o2.y) return o1.x - o2.x;
            else return o1.y - o2.y;
        });
        for (Point i : arr) {
            bw.write(i.x + " " + i.y + "\n");
        }
        bw.flush();
        bw.close();
    }
}