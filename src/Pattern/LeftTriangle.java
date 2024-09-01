package Pattern;

import java.util.Scanner;

/*
      1
    2 1
  3 2 1
4 3 2 1
 */
public class LeftTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=n-row;space>=1;space--){
                System.out.print("  ");
            }
            int num=row;
            for(int col=1;col<=row;col++){
                System.out.print(num+" ");
               num--;
            }
            System.out.println();
        }
    }
}
