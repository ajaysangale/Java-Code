package Pattern;
/*
1
B C
4 5 6
G H I J
11 12 13 14 15
 */

import java.util.Scanner;

public class DigitAlpha {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num of rows");
        int num1= sc.nextInt();
        int num=1;
        char ch='A';
        for(int row=1;row<=num1;row++){
            for(int col=1;col<=row;col++){
                if(row%2!=0){
                    System.out.print(num+" ");
                }else{
                    System.out.print(ch+" ");
                }
                num++;
                ch++;
            }
            System.out.println();
        }
    }
}
