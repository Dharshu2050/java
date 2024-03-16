import java.util.Scanner;

public class substr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //get two inputs and one string ,substring find eg : 2 to 6 string hello world o/p:ring h
        int a=sc.nextInt();
        sc.nextLine();

        int b=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String str=s.substring(a, b);
        System.out.println(str);
        
    }
}
