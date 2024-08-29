package Pattern;
/*
 #
 ###
#####
 ###
  #
 */
public class Diamond {
    public static void main(String[] args) {
        for(int row=1;row<=3;row++){
            for(int space=3-row;space>=1;space--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("#");
            }
            for(int row1=1;row1<=row-1;row1++){
                System.out.print("#");
            }

            System.out.println();
        }
        int x=5;
        for (int row2=1;row2<=2;row2++){

            for(int space=1;space<=row2;space++){
                System.out.print(" ");
            }
            for(int col=x;col>=3;col--){
                System.out.print("#");
            }
            x=x-2;
            System.out.println();
        }
    }
}
