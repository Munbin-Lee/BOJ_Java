import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.TreeSet;

public class BOJ4673 {

    public static int sumNumAndDigits(int num) {
        int result = num;
        for (int i = num; i > 0; i /= 10) {
            result += i % 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        //10000이하의 셀프 넘버가 아닌 수
        TreeSet<Integer> setNotSelfNumber = new TreeSet<>();
        for (int i = 1; ; i++) {
            int num = sumNumAndDigits(i);
            if (num <= 10000) {
                setNotSelfNumber.add(num);
            }
            else {
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Iterator<Integer> itr = setNotSelfNumber.iterator();
        int num = itr.next();
        for (int i = 1; i <= 9993; i++) {
            if (i != num) {
                bw.write(i + "\n");
            }
            else if (itr.hasNext()) {
                num = itr.next();
            }
        }
        bw.flush();
        bw.close();
    }
}
