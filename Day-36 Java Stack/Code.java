import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (sc.hasNext()) {
            
            String input=sc.next();
            Stack<Character> st = new Stack<>();
            //Complete the code
            
            if(input.length()%2!=0) 
            {
                System.out.println(false);
            }
            else{ 
                for(int i=0;i<input.length();i++){
                  if(input.charAt(i)=='{') st.push('}');
                  else if(input.charAt(i)=='(') st.push(')');
                  else if(input.charAt(i)=='[') st.push(']');
                  else if(st.isEmpty() || st.pop()!=input.charAt(i)){
                  flag=false;
                  break;  
                  }   
                }
                if(st.isEmpty() && flag==true)
                System.out.println(true);
                else {
                  System.out.println(flag);
                  flag=true;
                }
            }
        }
        sc.close();
        
    }
}
