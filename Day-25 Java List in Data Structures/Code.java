import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int L =  sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < L; i++)
        {
            int elements = sc.nextInt();
            arr.add(elements);
        }
        int Q = sc.nextInt();
        for (int i = 0;i<Q; i++)
        {
            String input = sc.next();
            if(input.equals("Insert"))
            {
                int index = sc.nextInt();
                int elements = sc.nextInt();
                arr.add(index,elements);
            }
            if (input.equals("Delete"))
            {
                int index =sc.nextInt();
                arr.remove(index);
            } 
        }
       for (Integer a:arr) 
       {
           System.out.print(a+" ");
       }
    }
}
