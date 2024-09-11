package FirstPackage;
import java.util.Scanner;
public class Practise2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);


        int sabbb = name.length();
        System.out.println(sabbb);

        String low = name.toUpperCase();
        System.out.println(low);

        String n = low.toLowerCase();
        System.out.println(n);


    }
}
