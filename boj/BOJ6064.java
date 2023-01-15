import java.io.*;
import java.util.StringTokenizer;

public class BOJ6064 {

    //extended Euclidean Algorithm
    //https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/
    public static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int cain(int M, int N, int x, int y) {
        int max = M * N / gcd(M, N); //최소공배수
        for (int i = x; i <= max; i += M) {
            if ((i - y) % N == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            bw.write(cain(Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
