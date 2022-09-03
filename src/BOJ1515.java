import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1515 {

    public static int solve(String str) {
        int n = 0;
        int i = 1;
        Loop:
        for (; i < str.length(); i++) {
            n++;
            String num = String.valueOf(n);
            int idx = 0;
            while (str.charAt(i) != num.charAt(idx)) {
                if (++idx >= num.length()) {
                    i--;
                    continue Loop;
                }
            }
        }
        return n;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(solve(str));
    }
}
