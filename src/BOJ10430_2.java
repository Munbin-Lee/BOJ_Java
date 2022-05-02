import java.io.*;
import java.util.StringTokenizer;

public class BOJ10430_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bw.write((A + B) % C + "\n");
        bw.write(((A % C) + (B % C)) % C + "\n");
        bw.write((A * B) % C + "\n");
        bw.write(((A % C) * (B % C)) % C + "\n");
        bw.flush();
        bw.close();
    }
}
