package Pattern;

import java.util.Scanner;
/*

 *       *
 **     **
 ***   ***
 **** ****
 *********
 **** ****
 ***   ***
 **     **
 *       *

 */
public class ButterFly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter odd num");
        int n= sc.nextInt();
        int y=n-1;
        int mean=(n/2)+1;
        for (int row = 1; row <= mean; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (int space = y - row; space >= row; space--) {
                System.out.print(" ");
            }
            for (int col1 = 1; col1 <= row; col1++) {
                if(row==mean && col1==mean){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int row2=1;row2<=mean-1;row2++){
            for (int col = mean-1; col >=row2 ; col--) {
                System.out.print("*");
            }
            for(int space=1;space<2*row2;space++){
                System.out.print(" ");
            }
            for(int col=mean-1;col>=row2;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

