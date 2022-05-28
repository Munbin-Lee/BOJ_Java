import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {

    public static int numOfComputers;
    public static int numOfInfected;
    public static boolean[] isInfected;
    public static boolean[][] isConnected;

    public static void infect(int i) {
        if (isInfected[i]) {
            return;
        }
        isInfected[i] = true;
        numOfInfected++;
        for (int j = 1; j <= numOfComputers; j++) {
            if (isConnected[i][j]) {
                infect(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        numOfComputers = Integer.parseInt(br.readLine());
        int numOfConnections = Integer.parseInt(br.readLine());
        isInfected = new boolean[numOfComputers + 1];
        isConnected = new boolean[numOfComputers + 1][numOfComputers + 1];

        while (numOfConnections-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            isConnected[num1][num2] = true;
            isConnected[num2][num1] = true;
        }

        numOfInfected = 0;
        infect(1);
        if (numOfInfected != 0) {
            numOfInfected--;
        }
        System.out.println(numOfInfected);
    }
}
