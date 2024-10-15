package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferStream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter team info");
        String name=br.readLine();
        System.out.println("Enter rank");
        int rank=Integer.parseInt(br.readLine());
        System.out.println("Enter grp");
        char grp=(char)br.read();
        System.out.println(name);
        System.out.println(rank);
        System.out.println(grp);
        br.skip(1); //used because after using read one line is skipped
        System.out.println("Enter team info");
        String name1=br.readLine();
        System.out.println("Enter rank");
        int rank1=Integer.parseInt(br.readLine());
        System.out.println("Enter grp");
        char grp1=(char)br.read();
        System.out.println(name1);
        System.out.println(rank1);
        System.out.println(grp1);

    }
}
