package Sep02.IO;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input");
        //sc.nextInt only present in scanner and can't be used in BufferedReader
        float x=sc.nextFloat();
        int y=sc.nextInt();
      //  Exception in thread "main" java.util.InputMismatchException
       // if used input other than int
        //for wrapperclass it gives NumberFormatException.
        System.out.println(x+y);
    }
}
