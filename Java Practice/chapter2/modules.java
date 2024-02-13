package chapter2;

import java.util.Scanner;

public class modules {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter the value of a:"+a);
        int b=sc.nextInt();
        System.out.println("enter the value of b:"+b);
        int c=a/b;
        int d=a-(c*b);
        System.out.println("remainder:"+d);

    }
}
