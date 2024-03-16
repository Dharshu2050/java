import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // n th character of string  eg:vcet position :3 
        String str=sc.nextLine();
        int n=sc.nextInt();
        int index=str.charAt(n);
         System.out.println((char)index);
         // o/p :t
    }
}
