import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {

    public static int makeNewNum(int num) {
        int sum = num / 10 + num % 10;
        int result = num % 10 * 10 + sum % 10;
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = makeNewNum(N);
        int cnt = 1;
        while (num != N) {
            num = makeNewNum(num);
            cnt++;
        }
        System.out.println(cnt);
    }
}