package FirstPackage;

import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
        byte a;
        System.out.print("Enter a number between 1-7: ");
        Scanner sc= new Scanner(System.in);
         a = sc.nextByte();
        switch(a){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println(" Sunday");
                break;
            default:
                System.out.printf("%d is Wrong value,please Enter value between (1-7)\n",a);
        }
    }
}
