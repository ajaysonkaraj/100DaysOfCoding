import java.io.*;                     
import java.util.*;

public class Solution {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();    //Taking input as Breadth
        int h = sc.nextInt();    //Taking input as Hight
        if (b>0 && h>0){
            
            System.out.println(b*h);  //Printing Area of parallelogram
        }
        else{                         //For negative input
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
