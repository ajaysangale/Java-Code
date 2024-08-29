package Pattern;
/*
 1
 121
12321
 */
public class EqulilateralNUM {
    public static void main(String[] args) {
        for(int row=1;row<=3;row++){
            int num=1;
            for(int space=3-row;space>=1;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print(num);
                num++;
            }
            for(int p=row-1;p>=1;p--){
                System.out.print(p);

            }
            System.out.println();
        }
    }
}
