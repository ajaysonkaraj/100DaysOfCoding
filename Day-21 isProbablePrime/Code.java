import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger no = new BigInteger(n);
        if (n.length()<= 100 && no.isProbablePrime(1)){
            
            System.out.print("prime");
        }
        else {
            System.out.print("not prime");
        }
        bufferedReader.close();
    } 
}
 
