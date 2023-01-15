import java.io.*;

public class BOJ24901 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i <= n; i++) {
            sb.append(Integer.toBinaryString(i));
        }
        System.out.println(sb);
    }
}
