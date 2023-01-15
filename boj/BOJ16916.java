import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16916 {

    //https://www.geeksforgeeks.org/java-program-for-kmp-algorithm-for-pattern-searching-2/
    public static int kmpSearch(String txt, String pat) {
        int[] lps = new int[pat.length()];
        computeLPSArray(pat, pat.length(), lps);
        int i = 0;
        int j = 0;

        while (i < txt.length()) {
            if (txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            if (j == pat.length()) {
                return 1;
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
        return 0;
    }

    public static void computeLPSArray(String pat, int M, int[] lps) {
        lps[0] = 0;
        int len = 0;
        int i = 1;

        while (i < M) {
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
        String S = br.readLine();
        String P = br.readLine();
        System.out.println(kmpSearch(S, P));
    }
}
