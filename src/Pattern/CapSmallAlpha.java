package Pattern;

import java.util.Scanner;

/*
A b C
d E f
G h I
 */
public class CapSmallAlpha {
    public static void main(String[] args) {
        int num=3;
        char ch='A';
        char ch1='a';
        for(int row=1;row<=num;row++){
            for(int col=1;col<=num;col++){
             if((row+col)%2==0){
                 System.out.print(ch);
             }else{
                 System.out.print(ch1);
             }
             ch++;
             ch1++;
            }

            System.out.println();
        }

    }
}


