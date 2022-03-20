import java.io.*;
import java.util.StringTokenizer;

public class BOJ2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int result = (int) Math.ceil(((double) V - A) / (A - B)) + 1;
        System.out.println(result);
    }
}