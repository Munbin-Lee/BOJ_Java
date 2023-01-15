import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken()); //시간
        int B = Integer.parseInt(st.nextToken()); //분
        int C = Integer.parseInt(br.readLine()); //추가 분
        B += C;
        while (B >= 60) {
            A++;
            B -= 60;
        }
        while (A >= 24) {
            A -= 24;
        }
        System.out.printf("%d %d", A, B);
    }
}
