import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2530 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(br.readLine());
        C += D % 86400;
        int temp = C / 60;
        C -= temp * 60;
        B += temp;
        temp = B / 60;
        B -= temp * 60;
        A += temp;
        if (A >= 24) {
            A -= 24;
        }
        System.out.println(A + " " + B + " " + C);
    }
}
