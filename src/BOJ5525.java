import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5525 {

    //https://www.geeksforgeeks.org/java-program-for-kmp-algorithm-for-pattern-searching-2/
    public static int kmpSearch(String txt, String pat) {
        int[] lps = new int[pat.length()];
        computeLPSArray(pat, lps);
        int cnt = 0;
        int i = 0;
        int j = 0;

        while (i < txt.length()) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                cnt++;
                j = lps[j - 1];
            }
            else if (i < txt.length() && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        return cnt;
    }

    public static void computeLPSArray(String pat, int[] lps) {
        int len = 0;
        int i = 1;

        while (i < pat.length()) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        @SuppressWarnings("unused")
        int M = Integer.parseInt(br.readLine());
        String S = br.readLine();
        StringBuilder sb = new StringBuilder("I");
        while (N-- > 0) {
            sb.append("OI");
        }
        System.out.println(kmpSearch(S, sb.toString()));
    }
}
