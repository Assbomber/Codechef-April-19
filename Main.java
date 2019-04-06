import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int N = scan.nextInt();
        int A[]=new int[N];
        for(int i=0;i<N;i++) A[i]=scan.nextInt();
        for (int i = 0; i <N; i++){
            for (int j=0; j<N; j++){
                if((A[i] % A[j])> max) max = (A[i] % A[j]);

            }}
        System.out.println(max);
    }}

