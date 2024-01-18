import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * buffered reader
 */
public class buffered {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=br.readLine();
        System.out.println(name);
        
    }

    
}