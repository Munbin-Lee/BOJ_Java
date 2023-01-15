import java.io.*;
import java.util.StringTokenizer;

public class BOJ4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int C = Integer.parseInt(br.readLine());
        while (C-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i] = num;
                sum += num;
            }

            double average = (double) sum / N;
            double result = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > average) result += 1;
            }
            result *= 100.0 / N;
            bw.write(String.format("%.3f", result) + "%\n");
        }
        bw.flush();
        bw.close();
    }
}
