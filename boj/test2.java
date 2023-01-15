import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class test2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            BigInteger n = new BigInteger(st.nextToken());
            String x = st.nextToken();
            String y = st.nextToken();
            ArrayDeque<String> dq = new ArrayDeque<>();
            if (!x.equals("0")) {
                dq.add(x + y);
            }
            dq.add(y + x);
            BigInteger mx = BigInteger.valueOf(-1);
            while (!dq.isEmpty()) {
                String curStr = dq.poll();
                BigInteger curBI = new BigInteger(curStr);
                if (curBI.compareTo(n) == 1) {
                    continue;
                }
                if (curBI.compareTo(mx) == 1) {
                    mx = curBI;
                }
                if (!x.equals("0")) {
                    dq.add(x + curStr);
                }
                dq.add(y + curStr);
                dq.add(curStr + x);
                dq.add(curStr + y);
            }
            System.out.printf("#%d %s\n", i, mx);
        }
    }
}
