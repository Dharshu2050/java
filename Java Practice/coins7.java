import java.util.Scanner;
import java.util.*;

public class coins7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        //add the poketmoney to get 10rs coins and 5rs coins o/p: for eg 10rs coins:5 10*5=50 5rs coins :5*5 =25 50+25=75  

        int a=10;
        int b=5;
        int c=2;
        int w=sc.nextInt();
        int e=sc.nextInt();
        int s=sc.nextInt();
        System.out.println("enter the on of 10 coins:" +w);
        System.out.println("enter the on of 10 coins:" +e);
        System.out.println("enter the on of 10 coins:" +s);

        int h=w*a;
        int q=e*b;
        int v=s*c;

        int d=h+q+v;
        
        System.out.println(d);
        
       


       

       


    }
}
