import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1515_2 {

    public static String stream(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s.append(i);
        }
        return s.toString();
    }

    public static boolean chk(String s1, String s2) {
        int idx = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (++idx >= s2.length()) return false;
            while (s1.charAt(i) != s2.charAt(idx)) {
                if (++idx >= s2.length()) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        for (int i = 1; ; i++) {
            String s = stream(i);
            if (chk(num, s)) {
                System.out.println(i);
                return;
            }
        }
    }
}
