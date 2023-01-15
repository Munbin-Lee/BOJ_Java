import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ9375 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            while (n-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String kind = st.nextToken();
                if (hashMap.containsKey(kind)) {
                    hashMap.put(kind, hashMap.get(kind) + 1);
                }
                else {
                    hashMap.put(kind, 1);
                }
            }
            int result = 1;
            for (int i : hashMap.values()) {
                result *= i + 1;
            }
            result--;
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
