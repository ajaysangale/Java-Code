package Pattern;

import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size");
        int n = sc.nextInt();
        int size = 2 * n - 1;
        int start = 0;
        int end = size - 1;
        int arr[][] = new int[size][size];
        while (n != 0) {
            for (int row = start; row <= end; row++) {
                for (int col = start; col <= end; col++) {
                    if (row == start || row == end || col == start || col == end) {
                        arr[row][col] = n;
                    }
                }

            }
            start++;
            end--;
            n--;
        }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
