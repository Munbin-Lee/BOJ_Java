import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2941 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num++;
            if (i + 1 < str.length()) {
                switch (str.charAt(i)) {
                    case 'c':
                        if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
                            i++;
                        }
                        break;
                    case 'd':
                        if (str.charAt(i + 1) == '-') {
                            i++;
                        }
                        else if (i + 2 < str.length() && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                            i += 2;
                        }
                        break;
                    case 'l':
                    case 'n':
                        if (str.charAt(i + 1) == 'j') {
                            i += 1;
                        }
                        break;
                    case 's':
                    case 'z':
                        if (str.charAt(i + 1) == '=') {
                            i += 1;
                        }
                        break;
                }
            }
        }
        System.out.println(num);
    }
}
