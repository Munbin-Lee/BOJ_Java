import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2798_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int maxSum = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] > M) {
                continue;
            }
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] + arr[j] > M) {
                    continue;
                }
                for (int k = j - 1; k >= 0; k--) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum > M) {
                        continue;
                    }
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }
        System.out.println(maxSum);
    }
}
