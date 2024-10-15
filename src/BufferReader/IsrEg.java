package BufferReader;
// To see all Packages go in JDK and then src and java.base folder.
import java.io.IOException;
import java.io.InputStreamReader;

public class IsrEg {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        int x=isr.read();
        System.out.println(x);
    }
}
