package chapter2;

import java.util.Scanner;

public class sum {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int c;
         int a=sc.nextInt();
         System.out.println("enter the value of a:"+a);
         int b=sc.nextInt();
         System.out.println("enter the value of b:"+b);
         c=a+b;
         System.out.println("sum of a&b:"+c);
         c=a-b;
         System.out.println("sub of a&b:"+c);
         c=a/b;
         System.out.println("div of a&b:"+c);
         c=a*b;
         System.out.println("mul of a&b:"+c);


    }
}
