package Pattern;

import java.util.Scanner;
import java.util.SortedMap;

/*
1
0 1
1 0 1
0 1 0 1
 */
public class BinaryTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num of rows");
        int num=sc.nextInt();
        for (int row = 1; row <=num ; row++) {
            for (int col = 1; col <=row ; col++) {
                if((row+col)%2==0) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
