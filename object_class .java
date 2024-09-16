package FirstPackage;
import java.util.Scanner;
class Student {
    int id;
    String name;
    public void printDetails(){
        System.out.format("my name is: %s \n",name);
        System.out.format("My student id is: %d \n", id);
    }
}

public class object_class {

    public static void main(String[] args) {
        Student Sabbir = new Student();
        Scanner sc = new Scanner(System.in);

        Sabbir.name = sc.nextLine();
        Sabbir.id = sc.nextInt();
        Sabbir.printDetails();
    }
}
