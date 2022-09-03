import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1969 {

    public static int M;

    public static char max(int A, int T, int G, int C) {
        int max = Math.max(A, Math.max(T, Math.max(G, C)));
        if (max == A) return 'A';
        if (max == C) return 'C';
        if (max == G) return 'G';
        return 'T';
    }

    public static int getDist(String[] dna, StringBuilder sb) {
        int dist = 0;
        for (String s : dna) {
            for (int i = 0; i < M; i++) {
                if (s.charAt(i) != sb.charAt(i)) dist++;
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String[] dna = new String[N];
        for (int i = 0; i < N; i++) {
            dna[i] = br.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int A = 0, T = 0, G = 0, C = 0;
            for (int j = 0; j < N; j++) {
                char tmp = dna[j].charAt(i);
                if (tmp == 'A') A++;
                else if (tmp == 'T') T++;
                else if (tmp == 'G') G++;
                else if (tmp == 'C') C++;
            }
            sb.append(max(A, T, G, C));
        }
        System.out.println(sb);
        System.out.println(getDist(dna, sb));
    }
}
