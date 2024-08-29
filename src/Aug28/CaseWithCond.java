package Aug28;
//Default will be the output.
public class CaseWithCond {
    public static void main(String[] args) {
        char ch='A';
        switch (ch){
            case 'a':
                if(ch=='A')
                    System.out.println("A");
                else
                    System.out.println("a");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
