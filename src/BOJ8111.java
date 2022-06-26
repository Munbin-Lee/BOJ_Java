//다시풀기(미완성)

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ8111 {

    public static String findKoosagaNumber(int num) {
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast("1");
        while (!deque.isEmpty()) {
            if (num == 999) {
                return "111111111111111111111111111";
            }
            String i = deque.removeFirst();
            if (i.length() > 100) {
                break;
            }
            if (new BigInteger(i).mod(BigInteger.valueOf(num)).equals(BigInteger.valueOf(0))) {
                return i;
            }
            deque.addLast(i + "0");
            deque.addLast(i + "1");
        }
        return "BREAK";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            bw.write(findKoosagaNumber(num) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
