import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 subject numbers ");
        float a= sc.nextInt();
        float b= sc.nextInt();
        float c= sc.nextInt();
        float d= sc.nextInt();
        float e= sc.nextInt();
        float cg = (a+b+c+d+e) / 50;
        System.out.print("your cg is: ");
        System.out.println(cg);
    }
}
