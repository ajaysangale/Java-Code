package Pattern;
/*
4 3 2 1
3 2 1
2 1
1
 */
public class NumLowerTriangle {
    public static void main(String[] args) {
        int x = 4;  // Number of rows to print

        // Outer loop for each row
        for (int i = 1 ;i <= x; i++) {
            // Inner loop to print numbers in each row
            for (int j = x- i+1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
        }
}

/* class PatternPrinter {
    public static void main(String[] args) {
        int rows = 4;  // Number of rows to print

        // Outer loop for each row
        for (int i = 0; i < rows; i++) {
            // Inner loop to print numbers in each row
            for (int j = rows - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
*/