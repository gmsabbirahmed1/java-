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

        String non_trimmed = "   sabbir ahmed.  ";
        System.out.println(non_trimmed);
        String trimm = non_trimmed.trim();
        System.out.println(trimm);

        System.out.println(trimm.substring(2));
        System.out.println(trimm.substring(1,9));

        String str2 = "sabbir";
        String str3 = str2.replace('b', 'j');
        String str4 = str2.replace("bb", "rjs");
        System.out.println(str4);
    }
}
