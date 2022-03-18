import java.io.*;
import java.util.StringTokenizer;

public class Spectrum {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][][][] arr = new int[5][2][9][2]; //보, 빨=0/파=1, 빨/파, 아르마=0/몬스터=1

        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line, " ");
            String type = st.nextToken();
            String result = st.nextToken();
            int purple = type.charAt(1) - '0';
            int isBlue = (type.charAt(2) == '파') ? 1 : 0;
            int num = type.charAt(3) - '0';
            int isMon = (result.equals("몬스터")) ? 1 : 0;
            arr[purple][isBlue][num][isMon]++;
        }
        for (int i = 2; i <= 8; i += 2) { //빨
            System.out.printf("빨%d 보%d: 아르마%d 몬스터%d\n", i, (10 - i) / 2, arr[(10 - i) / 2][0][i][0], arr[(10 - i) / 2][0][i][1]);
        }
        System.out.println();
        for (int i = 2; i <= 8; i += 2) { //파
            System.out.printf("파%d 보%d: 아르마%d 몬스터%d\n", i, (10 - i) / 2, arr[(10 - i) / 2][1][i][0], arr[(10 - i) / 2][1][i][1]);
        }
    }
}