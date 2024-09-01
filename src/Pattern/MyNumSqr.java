package Pattern;

import java.util.Scanner;
/*

3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

 */

public class MyNumSqr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int x = 3;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                // Calculate the distance to the nearest border
                int top = row - 1;
                int bottom = n - row;
                int left = col - 1;
                int right = n - col;

                // Find the minimum distance to any border
                int minDistanceToBorder = top;
                if (bottom < minDistanceToBorder) {
                    minDistanceToBorder = bottom;
                }
                if (left < minDistanceToBorder) {
                    minDistanceToBorder = left;
                }
                if (right < minDistanceToBorder) {
                    minDistanceToBorder = right;
                }

                // Calculate the number to print
                int numToPrint = x - minDistanceToBorder;
                System.out.print(numToPrint+" ");
            }
            System.out.println();  // Move to the next line after finishing the row
        }
    }
}