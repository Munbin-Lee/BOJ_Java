import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ11723 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> set = new TreeSet<>();
        TreeSet<Integer> setAll = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            setAll.add(i);
        }

        int M = Integer.parseInt(br.readLine());
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String operator = st.nextToken();
            switch (operator) {
                case "add": {
                    int num = Integer.parseInt(st.nextToken());
                    set.add(num);
                    break;
                }
                case "remove": {
                    int num = Integer.parseInt(st.nextToken());
                    set.remove(num);
                    break;
                }
                case "check": {
                    int num = Integer.parseInt(st.nextToken());
                    bw.write(set.contains(num) ? "1\n" : "0\n");
                    break;
                }
                case "toggle": {
                    int num = Integer.parseInt(st.nextToken());
                    if (set.contains(num)) {
                        set.remove(num);
                    }
                    else {
                        set.add(num);
                    }
                    break;
                }
                case "all": {
                    set = setAll;
                    break;
                }
                case "empty": {
                    set = new TreeSet<>();
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
