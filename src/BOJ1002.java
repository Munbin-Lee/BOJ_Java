import java.io.*;
import java.util.StringTokenizer;

public class BOJ1002 {

    public static int getNumOfLocations(int[] arr) {
        //do Something
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int[] arr = new int[6];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < 6; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            bw.write(getNumOfLocations(arr)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
