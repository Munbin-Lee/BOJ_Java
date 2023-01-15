import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23037_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        for (int n = Integer.parseInt(br.readLine()); n > 0; n /= 10) {
            int num = n % 10;
            result += Math.pow(num, 5);
        }
        System.out.println(result);
    }
}
