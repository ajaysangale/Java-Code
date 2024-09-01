package Pattern;

import java.util.Scanner;

/*
1 4 9 16
1 4 9
1 4
1
 */
public class SquareLowerRight {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter rows");
        int n=s.nextInt();
        for(int row=1;row<=n;row++){
            int num=1;
            for(int col=n;col>=row;col--){
                System.out.print(num*num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
