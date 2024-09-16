package FirstPackage;

public class var_Args {
    static int sum(int ...arr){
        int res=0;
        for(int a: arr){
            res+=a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("The some of 100,400 and 369 is = " + sum(100,400,369));
    }
}
