import java.util.*;
class Main {
    public static void main(String[] args) {
        char[] vovel = {'a', 'e', 'i', 'o', 'u'};
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();                                                 
        scan.nextLine();                                                        //Clearing buffer
        int counter[]= new int[T];                                              
        while (T > 0) {                                                      
            int L=scan.nextInt();                                   
            scan.nextLine();               
            String s = scan.nextLine();
            char a[] = s.toCharArray();            
            for (int i = 1; i < a.length; i++) {
                if (Arrays.binarySearch(vovel, a[i]) >= 0 && Arrays.binarySearch(vovel, a[i - 1]) < 0) {
                    //checking if the char is present in vovel array and one less is a consonant
                    counter[T-1]++;
                }
            }--T;             
        }
        for(int i=counter.length-1; i>=0;--i) {System.out.println(counter[i]);}
        }
    }
