package Pattern;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 */
public class RightAngle {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
