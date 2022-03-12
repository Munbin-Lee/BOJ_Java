import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2609 {

    //extended Euclidean Algorithm
    //https://www.geeksforgeeks.org/euclidean-algorithms-basic-and-extended/
    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        //최대공약수
        int result1 = gcd(num1, num2);
        System.out.println(result1);

        //최소공배수
        int result2 = num1 * num2 / result1;
        System.out.println(result2);
    }
}
