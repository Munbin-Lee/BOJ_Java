import java.io.*;

public class BOJ4948 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int primeMax = 123456 * 2 + 1;
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

        int num;
        while ((num = Integer.parseInt(br.readLine())) != 0) {
            int cnt = 0;
            for (int i = num + 1; i <= num * 2; i++) {
                if (primeArr[i]) {
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();
    }
}
