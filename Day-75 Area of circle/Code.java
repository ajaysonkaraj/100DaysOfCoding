import java.util.Scanner;
public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        double area = 0;
        switch (ch) {
            case 1 -> {
                System.out.println("Enter radius: ");
                double r = sc.nextDouble();
                area = Math.PI * r * r; }
            case 2 -> {
                System.out.println("Enter diameter: ");
                double d = sc.nextDouble();
                area = Math.PI * (d / 2) * (d / 2); }
            case 3 -> {
                System.out.println("Enter circumference: ");
                double c = sc.nextDouble();
                area = ((c * c) / (4 * Math.PI)); }
        }
        System.out.format("The area of the circle is : %.2f",area);
    }
}


