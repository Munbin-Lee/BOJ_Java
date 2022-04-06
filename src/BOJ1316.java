import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1316 {

    public static boolean check(String str) {
        char lastChr = '0';
        boolean[] used = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == lastChr) {
                continue;
            }
            lastChr = str.charAt(i);
            if (used[lastChr - 'a']) {
                return false;
            }
            else {
                used[lastChr - 'a'] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 0;
        while (N-- > 0) {
            String str = br.readLine();
            if (check(str)) {
                num++;
            }
        }
        System.out.println(num);
    }
}
