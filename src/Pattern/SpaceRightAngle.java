package Pattern;

import java.util.Scanner;

/*
      #
    # #
  # # #
# # # #
 */
public class SpaceRightAngle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=n-1;space>=row;space--){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
