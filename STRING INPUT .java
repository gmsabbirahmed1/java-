import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        System.out.print("What is your name:");
        String s = sc.nextLine();
        System.out.println("Hello, "+s+ "! Have a good day.");
    }
}
