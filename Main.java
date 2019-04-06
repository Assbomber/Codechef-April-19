/*
The first line of the input contains a single integer T denoting the number of test cases.
The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line contains a string S with length N, followed by a space and a character X.
:::::Sample:::::
2
3
abb b gives us 5
6
abcabc c gives us 15
 */
import java.util.Scanner;
public class Main {

    void in_counter() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();                                    //length N
        int M = N, x = 1;                                          //Copy of N is M
        scan.nextLine();
        String S = scan.nextLine();                                //String S
        int counter = 0;                                           //counter to count
        String X = scan.nextLine();                                // Char X
        for (int k = 0; k < N; k++) {
            for (int j = 0; j < M; j++) {
                //  System.out.println(S.substring(j,(j+x)));      //Remove comments to check substrings
                if (S.substring(j, (j + x)).contains(X)) ++counter;
            }x++;M--;
        }System.out.println(counter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main obj=new Main();
        int T = scan.nextInt();                                    //testcases
        for (int i = 0; i < T; i++)
            obj.in_counter();
    }
}

