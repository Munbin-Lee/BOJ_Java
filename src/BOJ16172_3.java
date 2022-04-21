//KMP Algorithm
//https://www.geeksforgeeks.org/java-program-for-kmp-algorithm-for-pattern-searching-2/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ16172_3 {

    public static int KMPSearch(String txt, String pat) {
        int[] lps = new int[pat.length()];
        computeLPSArray(pat, pat.length(), lps);
        int i = 0;
        int j = 0;
        while (i < txt.length()) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                if (++j == pat.length()) {
                    return 1;
                }
            }
            else  {
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
        int len = 0;
        int i = 1;
        lps[0] = 0;

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
        String S = br.readLine().replaceAll("[0-9]", "");
        String K = br.readLine();
        System.out.println(KMPSearch(S, K));
    }
}
