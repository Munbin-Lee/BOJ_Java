import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());
        String result = "Error";
        if (num1 + num2 + num3 == 180) {
            if (num1 == 60 && num2 == 60) {
                result = "Equilateral";
            }
            else if (num1 == num2 || num2 == num3 || num3 == num1) {
                result = "Isosceles";
            }
            else {
                result = "Scalene";
            }
        }
        System.out.println(result);
    }
}
