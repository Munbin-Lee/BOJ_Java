import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static String stream(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s.append(i);
        }
        return s.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(stream(N));
    }
}
