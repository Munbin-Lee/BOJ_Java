import java.io.*;
import java.util.Arrays;

public class BOJ1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        //길이 오름차순 -> 사전순
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            else return o1.length() - o2.length();
        });

        //중복 제거
        bw.write(arr[0] + "\n");
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                bw.write(arr[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
