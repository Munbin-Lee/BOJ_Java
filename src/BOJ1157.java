import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[26];
        int max = 0;
        int most = 0;
        boolean multi = false;

        for (int i = 0; i < str.length(); i++) {
            arr[(str.charAt(i) > 90) ? str.charAt(i) - 97 : str.charAt(i) - 65]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                most = i;
                multi = false;
            } else if (arr[i] == max)
                multi = true;
        }

        System.out.println(multi ? "?" : (char) (most + 65));

    }
}