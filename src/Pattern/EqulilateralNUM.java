package Pattern;

import java.util.Scanner;

/*
    1
  1 2 1
1 2 3 2 1
 */
public class EqulilateralNUM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row");
        int num1= sc.nextInt();
        for(int row=1;row<=num1;row++){
            int num=1;
            for(int space=num1-row;space>=1;space--){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(num+" ");
                num++;
            }
            for(int p=row-1;p>=1;p--){
                System.out.print(p+" ");

            }
            System.out.println();
        }
    }
}
