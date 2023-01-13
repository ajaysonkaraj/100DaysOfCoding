import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int sum = 0, count = 0, a;
        System.out.println("Enter the elements: ");
        for(int i = 0; i<n; i++)
        {
            a=sc.nextInt();
            if(a!=0)
                sum+=count;
            else
                count++;
        }
        System.out.println("Output = "+sum);
    }
}




