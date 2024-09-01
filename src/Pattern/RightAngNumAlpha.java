package Pattern;

import java.util.Scanner;

/*
1
A B
2 3 4
C D E F
 */
public class RightAngNumAlpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter num of rows");
        int num=sc.nextInt();
        int x=1;
        char ch='A';
        for(int row=1;row<=num;row++){
            for(int col=1;col<=row;col++){
                if(row%2==0){
                    System.out.print(ch+" ");
                    ch++;
                }else {
                    System.out.print(x+" ");
                    x++;
                }
            }
            System.out.println();
        }
    }
}
