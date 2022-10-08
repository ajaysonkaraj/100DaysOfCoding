import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
         char chr_a[] = a.toLowerCase().toCharArray();
        char chr_b[] = b.toLowerCase().toCharArray();
        
        if(a.length() != b.length()){
            return false;
        }
        
        int count[] = new int[256];
        
        for(int i = 0 ; i<a.length() ; i++){
            count[chr_a[i]]++;
            count[chr_b[i]]--;
        }
        
        for(int i = 0 ; i < 256 ; i++){
            if (count[i] != 0){
                return false;
            }
        }
        return true;
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
