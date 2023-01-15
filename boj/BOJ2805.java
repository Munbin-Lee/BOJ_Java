import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2805 {

    public static long cutTree(int[] arr, int H) {
        long sum = 0;
        for (int i : arr) {
            sum += Math.max((i - H), 0);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int min = 0;
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            max = Math.max(max, num);
        }

        while (min < max) {
            int mid = (min + max) / 2;
            if (cutTree(arr, mid) < M) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min - 1);
    }
}
