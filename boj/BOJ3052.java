import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[42];
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num % 42] = true;
        }

        int cnt = 0;
        for (boolean i : arr) {
            if (i) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
