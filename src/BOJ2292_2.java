import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2292_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        double b = Integer.parseInt(a.readLine());
        if (b == 1) System.out.print(1);
        else System.out.print((int) ((9 + Math.sqrt(9 + 12 * (b - 2))) / 6));
    }
}