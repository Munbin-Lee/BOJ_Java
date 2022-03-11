import java.io.*;
import java.util.StringTokenizer;

public class BOJ10951 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1, num2;
        String line;
        StringTokenizer st;

        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line, " ");
            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());
            bw.write(num1 + num2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}