package com.comphany;
import java.util.Scanner;

public class cwh5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String sab= sc.nextLine();
        System.out.println("Welcome ");
        System.out.println(sab);
        System.out.println("Enter number 1: ");
        int a= sc.nextInt();
        System.out.println("Enter number 2: ");
        int b= sc.nextInt();
        int sum= a + b ;
        System.out.print("sum of two number is = ");
        System.out.println(sum);

    }
}
