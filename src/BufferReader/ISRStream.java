package BufferReader;

import java.io.IOException;
import java.io.InputStreamReader;
//one more output which is printed is already present in buffer
public class ISRStream {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        int x= isr.read();
        System.out.println(x);
        isr.close();
        int y=isr.read();
        System.out.println(y);
        //int z= isr.read();
        //System.out.println();
    }
}
