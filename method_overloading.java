package FirstPackage;

public class method_overloading {
    static void Hashi(){
        System.out.println("I love you Hashi.");
    }
    static void Hashi(int a){
        for(int i=0; i<a; i++){
            System.out.println("I love you Hashi.");
        }
    }
    public static void main(String[] args) {
        Hashi();

        System.out.println("n \n l");
        int b = 300;
        Hashi(b);

    }
}
