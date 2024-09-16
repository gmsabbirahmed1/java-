package FirstPackage;

import java.util.Scanner;

public class method {
    static int logic(int x, int y ){
            int z;
            if (x>y){
                z=x+y;
            }
            else {
                z = (x + y) * 5;
            }
            return z;
    }

    public static void main(String[] args) {
        int sa,sa2;
        Scanner sc=new Scanner(System.in);
        sa = sc.nextInt();
        sa2= sc.nextInt();

        int sabbath=logic(sa,sa2);
        System.out.println(sabbath);


    }
}
