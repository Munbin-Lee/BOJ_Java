import java.io.*;

public class BOJ1003 {

    public static class Cnt {
        public int zero;
        public int one;

        public Cnt(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
    }

    public static Cnt countFibo(int num) {
        int zero = 1;
        int one = 0;
        while (num-- > 0) {
            int tmp = zero;
            zero = one;
            one += tmp;
        }
        return new Cnt(zero, one);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Cnt cnt = countFibo(N);
            bw.write(cnt.zero + " " + cnt.one + "\n");
        }
        bw.flush();
        bw.close();
    }
}
