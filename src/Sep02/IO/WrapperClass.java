package Sep02.IO;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input");
        String x=sc.next();
        String y=sc.next();
        String str=sc.next();
        int var1=Integer.parseInt(x);
        int var2=Integer.parseInt(y);
        //Exception in thread "main" java.lang.NumberFormatException
        //If String is entered as Input
        System.out.println(var1+var2);
        System.out.println(str);
    }
}
