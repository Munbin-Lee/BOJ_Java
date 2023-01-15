import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1074 {

    public static int getPart(int row, int column, int size) {
        int part = 0;
        if (row >= size / 2) {
            part += 2;
        }
        if (column >= size / 2) {
            part++;
        }
        return part;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;
        while (N > 0) {
            result += getPart(r, c, (int) Math.pow(2, N)) * Math.pow(2, 2 * N - 2);
            int temp = (int) Math.pow(2, N - 1);
            if (r >= temp) {
                r -= temp;
            }
            if (c >= temp) {
                c -= temp;
            }
            N--;
        }
        System.out.println(result);
    }
}
