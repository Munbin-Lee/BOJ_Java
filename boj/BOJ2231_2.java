import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231_2 {

    public static int decompose(int num) {
        int result = num;
        for (; num > 0; num /= 10) {
            result += num % 10;
        }
        return result;
    }

    public static int findConstructor(int num) {
        for (int i = 1; i < num; i++) {
            if (decompose(i) == num) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(findConstructor(N));
    }
}
