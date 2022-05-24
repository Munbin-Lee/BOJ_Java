import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1541_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer nums = new StringTokenizer(line, "+-");
        StringTokenizer operators = new StringTokenizer(line, "0123456789");
        int result = Integer.parseInt(nums.nextToken());
        boolean minus = false;
        while (operators.hasMoreTokens()) {
            if (operators.nextToken().equals("-")) {
                minus = true;
            }
            int num = Integer.parseInt(nums.nextToken());
            if (minus) {
                num *= -1;
            }
            result += num;
        }
        System.out.println(result);
    }
}
