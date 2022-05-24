import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];
        for (; num > 0; num /= 10) {
            arr[num % 10]++;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}