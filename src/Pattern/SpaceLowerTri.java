package Pattern;

import java.util.Scanner;

/*
# # # #
  # # #
    # #
      #
 */
public class SpaceLowerTri {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=row-1;space++){
                System.out.print("  ");
            }
            for(int col=row;col<=n;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
