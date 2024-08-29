package Aug28;

public class SwitchEg {
    public static void main(String[] args) {
        byte x=5;
        // Only boolean works in switch i.e it must be true or false
        switch (x){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;

        }
    }
}
