package Pattern;
/*
1
A B
2 3 4
C D E F
 */
public class RightAngNumAlpha {
    public static void main(String[] args) {
        int x=1;
        char ch='A';
        for(int row=1;row<=4;row++){
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
