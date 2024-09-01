package Pattern;

/*

X X X X X X X X X X X X X
X X X X X       X X X X X
X X X X           X X X X
X X X               X X X
X X                   X X
X                       X
X                       X
X X                   X X
X X X               X X X
X X X X           X X X X
X X X X X       X X X X X
X X X X X X X X X X X X X

 */

import java.util.Scanner;

public class RectSpace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for (int row = 1; row <=n ; row++) {
            for (int col = n; col >=row ; col--) {
                System.out.print("X ");
            }
            for (int space = 1; space <=2*row-1 ; space++) {
                if (row == 1) {
                    System.out.print("X ");
                }else{
                System.out.print("  ");
            }
            }
            for (int col = n; col >=row ; col--) {
                System.out.print("X ");
            }
            System.out.println();
        }
        for (int row2 = n; row2 >=1 ; row2--) {
            for (int col = 1; col <=n-row2+1 ; col++) {
                System.out.print("X ");
            }
            for (int space =2*row2-1; space >0 ; space--) {
                if(row2==1){
                    System.out.print("X ");
                }else {
                System.out.print("  ");
            }
            }
            for (int col = 1; col <=n-row2+1 ; col++) {
                System.out.print("X ");
            }
            System.out.println();
        }
        }
    }

