import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class BOJ7662 {

    @SuppressWarnings("ConstantConditions")
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int K = Integer.parseInt(br.readLine());
            while (K-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String operator = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if (operator.equals("I")) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
                else if (num == -1 && !map.isEmpty()) {
                    if (map.put(map.firstKey(), map.get(map.firstKey()) - 1) == 1) {
                        map.remove(map.firstKey());
                    }
                }
                else if (num == 1 && !map.isEmpty()) {
                    if (map.put(map.lastKey(), map.get(map.lastKey()) - 1) == 1) {
                        map.remove(map.lastKey());
                    }
                }
            }
            if (map.isEmpty()) {
                bw.write("EMPTY\n");
            }
            else {
                bw.write(map.lastKey() + " " + map.firstKey() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
