package Pattern;

import java.util.Scanner;

/*
    #
  # # #
# # # # #
  # # #
    #
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = n - 1; space >= row; space--) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        for (int row1 = n-1; row1 >=1; row1--) {
            for (int space = 1; space <= n-row1; space++) {
                System.out.print("  ");
            }
            for (int col = 2 * row1 - 1; col >=1; col--) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}



