import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String s = "";
        int n = sc.nextInt();
        while (n>0)
        {
            if(n>=1000){
                s = s.concat("M");
                n = n - 1000;
            }
            else if (n>=900){
                s = s.concat("CM");
                n = n - 900;
            }
            else if (n>=500){
                s = s.concat("D");
                n = n - 500;
            }
            else if (n>=400){
                s = s.concat("CD");
                n = n - 400;
            }
            else if (n>=100){
                s = s.concat("C");
                n = n - 100;
            }
            else if (n>=90){
                s = s.concat("XC");
                n = n - 90;
            }
            else if (n>=50){
                s = s.concat("L");
                n = n - 50;
            }
            else if (n>=40){
                s = s.concat("XL");
                n = n - 40;
            }
            else if (n>=10){
                s = s.concat("X");
                n = n - 10;
            }
            else if (n>=9){
                s = s.concat("IX");
                n = n - 9;
            }
            else if (n>=5){
                s = s.concat("V");
                n = n - 5;
            }
            else if (n>=4){
                s = s.concat("IV");
                n = n - 4;
            }
            else {
                s = s.concat("I");
                n = n - 1;
            }
        }
        System.out.println(s);
    }
}
