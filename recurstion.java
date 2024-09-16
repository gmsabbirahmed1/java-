package FirstPackage;

public class recurstion {
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int a = factorial(7);
        System.out.println(a);

    }
    
}
