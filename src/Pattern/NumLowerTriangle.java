package Pattern;

import java.util.Scanner;

/*
4 3 2 1
3 2 1
2 1
1
 */
public class NumLowerTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num of rows");
        int x = sc.nextInt();
        for (int row = 1; row <= x; row++) {
            for (int col = x-row+1; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        }
}
