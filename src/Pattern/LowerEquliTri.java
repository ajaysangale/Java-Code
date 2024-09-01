package Pattern;

import java.util.Scanner;
import java.util.SortedMap;

/*
# # # # #
  # # #
    #
 */
public class LowerEquliTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num of rows");
        int n= sc.nextInt();
        int x=n+2;
        for(int row=1;row<=n;row++){

            for(int space=1;space<=row-1;space++){
                System.out.print("  ");
            }
            for(int col=1;col<=x;col++){
                System.out.print("# ");
            }
            x=x-2;
            System.out.println();
        }
    }
}
