import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ1620 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N + 1];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            map.put(str, i);
            arr[i] = str;
        }

        while (M-- > 0) {
            String str = br.readLine();
            if (Character.isDigit(str.charAt(0))) { //입력이 숫자인 경우
                int index = Integer.parseInt(str);
                bw.write(arr[index] + "\n");
            }
            else {
                bw.write(map.get(str) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
