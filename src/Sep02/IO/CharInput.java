package Sep02.IO;

import java.util.Scanner;
// Every time we need String to take input for char.
public class CharInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();
        // If we add morenumber of char than actual string it gives Exception
        // StringIndexOutOfBoundsException
        char ch=s.charAt(3);
        System.out.println(ch);
    }
}
