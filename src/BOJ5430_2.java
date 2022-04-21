import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ5430_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            char[] p = br.readLine().toCharArray();
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine(), "[],");
            while (n-- > 0) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            boolean error = false;
            boolean reverse = false;
            for (char i : p) {
                if (i == 'D') {
                    if (list.isEmpty()) {
                        error = true;
                        break;
                    }
                    else {
                        if (!reverse) {
                            list.remove(0);
                        }
                        else {
                            list.remove(list.size() - 1);
                        }
                    }
                }
                else { //i=='R'
                    reverse = !reverse;
                }
            }

            if (!error) {
                if (reverse) {
                    Collections.reverse(list);
                }
                sb.append("[");
                for (int i : list) {
                    sb.append(i).append(",");
                }
                if (!list.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("]\n");
            }
            else {
                sb.append("error\n");
            }
        }
        System.out.println(sb);
    }
}
