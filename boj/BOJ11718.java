import java.io.*;

public class BOJ11718 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            System.out.println(line);
        }
        bw.flush();
        bw.close();
    }
}
