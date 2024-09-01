package Pattern;

import java.util.Scanner;
/*

X               X
  X           X
    X       X
      X   X
        X
      X   X
    X       X
  X           X
X               X

 */
public class X {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num");
        int num= sc.nextInt();
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
                if(row==col || (row+col==num+1)){
                    System.out.print("X ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
