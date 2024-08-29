package Pattern;
/*
#####
 ###
  #
 */
public class LowerEquliTri {
    public static void main(String[] args) {
        int x=5;
        for(int row=1;row<=3;row++){

            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=x;col++){
                System.out.print("#");
            }
            x=x-2;
            System.out.println();
        }
    }
}
