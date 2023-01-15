import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5532 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        float A = Float.parseFloat(br.readLine());
        float B = Float.parseFloat(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int kor = (int) Math.ceil(A / C);
        int math = (int) Math.ceil(B / D);
        System.out.println(L - Math.max(kor, math));
    }
}
