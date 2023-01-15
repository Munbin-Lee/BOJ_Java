import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1786 {

    //https://www.geeksforgeeks.org/java-program-for-kmp-algorithm-for-pattern-searching-2/
    public static void kmpSearch(String txt, String pat) {
        StringBuilder sb = new StringBuilder();
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
                sb.append(i - j + 1).append(" ");
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
        System.out.println(cnt);
        System.out.println(sb);
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
        String T = br.readLine();
        String P = br.readLine();
        kmpSearch(T, P);
    }
}
