package Pattern;
/*
1 4 9 16
1 4 9
1 4
1
 */
public class SquareLowerRight {
    public static void main(String[] args) {

        for(int row=1;row<=4;row++){
            int num=1;
            for(int col=4;col>=row;col--){
                System.out.print(num*num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
