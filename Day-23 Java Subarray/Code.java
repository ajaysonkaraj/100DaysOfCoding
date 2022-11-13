import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int noOfElement = sc.nextInt();
       int [] arr = new int[noOfElement];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();
       }
        
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int currentCount = 0;
            for(int j = i; j < arr.length; j++) {
                currentCount += arr[j];
                if(currentCount < 0) count++;
            }
        }
        System.out.println(count);
    }
}
