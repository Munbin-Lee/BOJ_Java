//다시풀기

import java.io.*;
import java.util.StringTokenizer;

public class BOJ19585 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[] color = new String[C];
        String[] nick = new String[N];
        for (int i = 0; i < C; i++) {
            color[i] = br.readLine();
        }
        for (int i = 0; i < N; i++) {
            nick[i] = br.readLine();
        }
        int Q = Integer.parseInt(br.readLine());
        int index = -1;
        String result = "No\n";
        
        while (Q-- > 0) {
            String team = br.readLine();
            for (String c : color) {
                boolean pass = true;
                for (int i = 0; i < c.length(); i++) {
                    if (team.charAt(i) != c.charAt(i)) {
                        pass = false;
                        break;
                    }
                }
                if (pass) {
                    index = c.length();
                    break;
                }
            }
            if (index != -1) {
                for (String n : nick) {
                    boolean pass = true;
                    for (int i = 0; i < n.length(); i++) {
                        if ((team.charAt(index + i) != n.charAt(i))) {
                            pass = false;
                            break;
                        }
                    }
                    if (pass) {
                        result = "Yes\n";
                        break;
                    }
                }
            }
            bw.write(result);
        }
        bw.flush();
        bw.close();
    }
}
