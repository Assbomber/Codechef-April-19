/*
Chef and Dhyey have become friends recently. Chef wants to test Dhyey's intelligence by giving him a puzzle to solve.

The puzzle contains an integer sequence A1,A2,…,AN. The answer to the puzzle is the maximum of Ai%Aj, taken over all valid i, j.

Help Dhyey solve this puzzle.
::::::Sample:::::
Input:
5  
1 2 3 4 5 
output: 
4
*/

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

