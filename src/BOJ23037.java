import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ23037 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int result = 0;
        for (int i = 0; i < 5; i++) {
            int num = n.charAt(i) - '0';
            result += Math.pow(num, 5);
        }
        System.out.println(result);
    }
}
