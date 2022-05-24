import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//N,K값을 저장
        int K=sc.nextInt();
        int[]value=new int[N];
        int count=0;
        for(int i=0;i<N;i++) {   //모든 동전의 가치를 배열에 넣는다.
            value[i]=sc.nextInt();
        }
        for(int j=N-1;j>=0;j--) { //배열의 각 값을 K와 비교한다.
            while (K>=value[j]) {  //0인 상태에서는 뺄 필요가 없으므로 0이 아닌조건 추가.
                K=K-value[j];         //K보다 작은 값인 동전의 가치만큼 K에서 뺀다.
                count=count+1;         //이를 반복하면서 뺀 동전의 갯수를 센다.

            }

        }
        System.out.println(count);
    }

}