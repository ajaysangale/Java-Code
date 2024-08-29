package Pattern;

/*
x x x x x x x
X X X   X X X
X X       X X
X           X
X X       X X
X X X   X X X
x x x x x x x
 */

public class RectSpace {
    public static void main(String[] args) {
        for(int row=1;row<=7;row++){
            for(int col=1;col<=7;col++) {
                System.out.print("X ");
            }
        }
    }
}
