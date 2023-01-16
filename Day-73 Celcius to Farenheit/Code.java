import java.util.Scanner;
class CelciusToFarenheit{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celcius : ");
        int celcius = sc.nextInt();

        double farenheit = (1.8d * celcius)+32d;

        System.out.println(celcius+"C = "+farenheit+"F");
    }
}
