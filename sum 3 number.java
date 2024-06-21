import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 numbers ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();

        int sum = a + b + c;
        System.out.print("sum of those 3 numbers: ");
        System.out.println(sum);
    }
}
