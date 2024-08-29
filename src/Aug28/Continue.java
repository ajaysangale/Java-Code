package Aug28;
//continue means it jumps again in loop
public class Continue {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            if(i>=4){
                continue;
            }
            System.out.println(i);
        }
    }
}
