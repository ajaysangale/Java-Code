package Pattern;
/*
AbC
dEf
GhI
 */
public class SingleFor {
    public static void main(String[] args) {
        char ch='A';
        char ch1='a';

        for(int row=1;row<=9;row++){
            if(row%2!=0){
                System.out.print(ch);
            }else {
                System.out.print(ch1);
            }
            ch++;
            ch1++;
            if(row%3==0){
                System.out.println();
            }

        }
    }
}
