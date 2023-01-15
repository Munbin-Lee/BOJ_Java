import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2530_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(br.readLine());
        C += D;
        while (C >= 60) {
            C -= 60;
            B++;
        }
        while (B >= 60) {
            B -= 60;
            A++;
        }
        while (A >= 24) {
            A -= 24;
        }
        System.out.println(A + " " + B + " " + C);
    }
}
