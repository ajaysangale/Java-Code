package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String name=br.readLine();
        System.out.println(name);
        int JerNo= Integer.parseInt(br.readLine());
        System.out.println(JerNo);
        float avg= Float.parseFloat(br.readLine());
        System.out.println(avg);

    }
}
