import java.io.*;
import java.util.StringTokenizer;

public class BOJ5086 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            if (num1 == 0) {
                break;
            }
            int num2 = Integer.parseInt(st.nextToken());
            if (num1 % num2 == 0) {
                bw.write("multiple\n");
            }
            else if (num2 % num1 == 0) {
                bw.write("factor\n");
            }
            else {
                bw.write("neither\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
