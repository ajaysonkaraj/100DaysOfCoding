import java.util.*;

public class Solution {

    public static void main(String[] args) {   // main class
	   
        Scanner scan = new Scanner(System.in); // using scanner class 
        int n = scan.nextInt();                // How much number you want to enter
        int a[] = new int[n];
        for (int i = 0; i <a.length; i++) {
            a[i] = scan.nextInt();             //Taking array input
        }
        scan.close();

                                               // Printing each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
