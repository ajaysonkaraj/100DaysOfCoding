import java.util.*;
import java.io.*;


class CheckRange{
    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)                                //Byte range 
                System.out.println("* byte");
                
                if (x>=-32768  && x<=32767 )                        //Short range
                System.out.println("* short");
                
                if(x>=-2147483648 && x<=2147483647)                 //Int range
                System.out.println("* int");
                
                if(x>=-9223372036854775808l && x<= 9223372036854775807l)    //long range
                System.out.println("* long");

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



