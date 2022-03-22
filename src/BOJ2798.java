import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2798 {

    public static int N;
    public static int[] arr;

    public static int findMaxSum(int max) {
        int maxSum = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (arr[i] > max) continue;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] + arr[j] > max) continue;
                for (int k = j - 1; k >= 0; k--) {
                    if (arr[i] + arr[j] + arr[k] > max) continue;
                    maxSum = Math.max(maxSum, arr[i] + arr[j] + arr[k]);
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(findMaxSum(M));
    }
}
