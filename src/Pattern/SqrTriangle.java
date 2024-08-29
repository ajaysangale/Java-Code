package Pattern;
/*
        1
      1 4
    1 4 9
  1 4 9 16
 */
public class SqrTriangle {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){
            int num=1;
            for(int space=4-row;space>=1;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(num*num);
                num++;
            }
            System.out.println();
        }
    }
}
