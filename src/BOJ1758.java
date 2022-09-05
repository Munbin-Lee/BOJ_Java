import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1758 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        long tip = 0;
        for (int i = 0; i < N; i++) {
            tip += Math.max(arr[i] - i, 0); // 음수면 +0
        }

        System.out.println(tip);
    }
}
