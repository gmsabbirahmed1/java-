package FirstPackage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sab = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sab.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sab.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = sab.nextInt();
        int sum =  num1 + num2 + num3;

        System.out.println("The sum of three number  is == "+ sum);

    }
}
