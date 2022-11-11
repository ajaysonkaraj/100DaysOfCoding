import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
       
        String B = "";              // creating new string for store reverse value
        for (int i = 0; i< A.length();i++){
            
            char store = A.charAt(i);
            B = store + B;   
        }
    if (B.compareTo(A)==0)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
}
}
