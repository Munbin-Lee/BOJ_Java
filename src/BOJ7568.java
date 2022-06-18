import java.io.*;
import java.util.StringTokenizer;

public class BOJ7568 {

    private static class Bulk {
        public final int weight;
        public final int height;
        public int rank;

        public Bulk(int weight, int height) {
            this.weight = weight;
            this.height = height;
            this.rank = 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Bulk[] arrBulk = new Bulk[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            arrBulk[i] = new Bulk(weight, height);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arrBulk[i].weight < arrBulk[j].weight
                        && arrBulk[i].height < arrBulk[j].height) {
                    arrBulk[i].rank++;
                }
            }
            bw.write(arrBulk[i].rank + " ");
        }
        bw.flush();
        bw.close();
    }
}
