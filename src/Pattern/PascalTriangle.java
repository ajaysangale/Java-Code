package Pattern;

import java.util.Scanner;
/*
   1
  1 1
 1 2 1
1 3 3 1
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for (int row = 0; row <n ; row++) {
            for (int space = n-1; space >row ; space--) {
                System.out.print(" ");
            }
            System.out.print("1 ");
            for (int col = 1; col <row ; col++) {
                if(row>1){
                    System.out.print(row+" ");
                }
            }
           if(row>0) {
               System.out.print("1 ");
           }
            System.out.println();
        }
    }
}
