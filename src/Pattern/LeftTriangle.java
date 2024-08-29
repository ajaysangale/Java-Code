package Pattern;
/*
   1
  21
 321
4321
 */
public class LeftTriangle {
    public static void main(String[] args) {
        for(int row=1;row<=4;row++){
            for(int space=4-row;space>=1;space--){
                System.out.print(" ");
            }
            int num=row;
            for(int col=1;col<=row;col++){
                System.out.print(num);
               num--;
            }
            System.out.println();
        }
    }
}
