package Pattern;

import java.util.Scanner;

/*
    #
  # # #
# # # # #
 */
public class Equilateral {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter rows");
        int num1=s.nextInt();
        for(int row=1;row<=num1;row++){
            int num=1;
            for(int space=num1-row;space>=1;space--){
                System.out.print("  ");
            }

            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
                }
            for(int p=1;p<=row-1;p++){
                System.out.print("# ");
            }
            System.out.println();

            }
        }
    }

