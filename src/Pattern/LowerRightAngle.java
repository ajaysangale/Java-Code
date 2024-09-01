package Pattern;

import java.util.Scanner;

/*

 * * * *
 * * *
 * *
 *

 */
public class LowerRightAngle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter num of rows");
        int num=s.nextInt();
        for(int row=1;row<=num;row++){
            for(int col=num;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
