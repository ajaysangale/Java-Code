package Pattern;
import java.util.Scanner;
/*
                  X
                X   X
              X       X
            X           X
          X               X
        X                   X
      X                       X
    X                           X
  X                               X
X X X X X X X X X X X X X X X X X X X

 */
public class HollowTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Num");
        int num= sc.nextInt();
        int mean=(num/2)+1;
        for (int row1 = 1; row1 <=num ; row1++) {
            for (int space = num-1; space >=row1 ; space--) {
                System.out.print("  ");
            }
                System.out.print("X ");
            for (int space2 = 1; space2 <2*row1-2 ; space2++) {
                if (row1 == num) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
           // for (int col1 =1 ; col1 <row1 ; col1++) {
            if(row1>1) {
                System.out.print("X ");
            }
             //   break;
            //}

            System.out.println();
        }
    }

}
