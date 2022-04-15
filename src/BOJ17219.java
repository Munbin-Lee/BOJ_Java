import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ17219 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> hashMap = new HashMap<>();
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");
            hashMap.put(st.nextToken(), st.nextToken());
        }
        while (M-- > 0) {
            bw.write(hashMap.get(br.readLine()) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
