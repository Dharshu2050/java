//convert sec to hour ,minute,sec
package chapter2;
import java.io.*;
import java.util.Scanner;


public class sectohours {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("input sec:");
        int sec=sc.nextInt();

        int s=sec%60;
        int h=sec/60;
        int m=h%60;
        h=h/60;
        System.out.println(h +":"+m+":"+s+":");
        System.out.println("\n");

    }
}
