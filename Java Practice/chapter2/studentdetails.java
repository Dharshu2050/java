
 
package chapter2;
import java.io.*;
import java.util.Scanner;
/**
 * studentdetails
 */
public class studentdetails {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("enter your name:"+name);
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("eneter your age:"+age);
        String rollno=sc.nextLine();
        System.out.println("enter your roll number:"+rollno);
        int CGPA=sc.nextInt();
        System.out.println("enter your CGPA:"+CGPA);
        String gender=sc.nextLine();
        sc.nextLine();
        System.out.println("enter your gender:"+gender);
    }

    
}