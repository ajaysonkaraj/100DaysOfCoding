import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] a2 = b.toLowerCase().toCharArray();
        if(a1.length != a2.length)
        {
            return false;
        }
        else
        {
            java.util.Arrays.sort(a1);
            java.util.Arrays.sort(a2);
            
            return java.util.Arrays.equals(a1, a2);
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
