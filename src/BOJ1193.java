import java.io.*;

public class BOJ1193 {

    private static int swap3(int num, int ignoredNum) {
        return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());
        int sum = 1;
        for (int i = 0; ; i++) {
            sum += i;
            int d = sum - X;
            if (d > 0) {
                int num1 = d;
                int num2 = i + 1 - d;
                if (i % 2 == 0) {
                    num2 = swap3(num1, num1 = num2);
                }
                bw.write(num1 + "/" + num2);
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
