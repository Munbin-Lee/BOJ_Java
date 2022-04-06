import java.io.*;

public class BOJ9020 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int primeMax = 10000;
        boolean[] primeArr = new boolean[primeMax + 1];
        for (int i = 2; i <= primeMax; i++) {
            primeArr[i] = true;
        }
        for (int i = 2; (i * i) <= primeMax; i++) {
            if (primeArr[i]) {
                for (int j = (i * i); j <= primeMax; j += i) {
                    primeArr[j] = false;
                }
            }
        }

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            for (int i = num / 2; ; i--) {
                if (primeArr[i] && primeArr[num - i]) {
                    bw.write(i + " " + (num - i) + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
