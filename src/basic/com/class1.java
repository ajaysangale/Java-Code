package basic.com;

class class1 {
    public static void main(String[] args) {
        System.out.println("inside class");
        class2.fun1();
    }
    public static void fun(){
        System.out.println("In fun");
    }
    private class class2{
        static void fun1(){
            System.out.println("Hii from class2");
        }
    }
}
