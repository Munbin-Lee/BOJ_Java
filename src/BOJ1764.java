import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        TreeSet<String> setN = new TreeSet<>();
        while (N-- > 0) {
            setN.add(br.readLine());
        }
        TreeSet<String> setM = new TreeSet<>();
        while (M-- > 0) {
            setM.add(br.readLine());
        }
        int cnt = 0;
        for (String str : setM) {
            if (setN.contains(str)) {
                sb.append(str).append("\n");
                cnt++;
            }
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
