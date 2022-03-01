import java.io.*;

public class BOJ10809 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i) - 97] == -1) arr[S.charAt(i) - 97] = i;
        }

        for (int i = 0; i < 26; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();

    }
}
