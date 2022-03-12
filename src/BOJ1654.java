import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long max = 0;
        long min = 0;
        long mid;
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            max = Math.max(max, num);
        }
        max++;

        //이진탐색
        while (min < max) {
            mid = (max + min) / 2;
            int sum = 0;
            for (int j : arr) {
                sum += j / mid;
            }
            if (sum < N) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
