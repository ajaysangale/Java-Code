package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.StringTokenizer;

// Used to take input on single line
public class Token1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str= br.readLine();
        StringTokenizer s=new StringTokenizer(str , ",");
        String s1=s.nextToken();
        String s2=s.nextToken();
        String s3= s.nextToken();

        System.out.println(s1+" "+s2+" "+s3);

    }
}
