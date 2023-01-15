import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class BOJ1541 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer num = new StringTokenizer(line, "+-");
        StringTokenizer operator = new StringTokenizer(line, "0123456789");
        int result = Integer.parseInt(num.nextToken());
        boolean minus = false;
        while (true) {
            try {
                if (operator.nextToken().equals("-")) {
                    minus = true;
                }
            } catch (NoSuchElementException e) {
                break;
            }
            int _num = Integer.parseInt(num.nextToken());
            if (minus) {
                _num *= -1;
            }
            result += _num;
        }
        System.out.println(result);
    }
}
