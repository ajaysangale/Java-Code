package Pattern;
/*
AbC
dEf
GhI
 */
public class CapSmallAlpha {
    public static void main(String[] args) {
        char ch='A';
        char ch1='a';
        for(int row=1;row<=3;row++){
            for(int col=1;col<=3;col++){
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


