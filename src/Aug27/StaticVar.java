package Aug27;
// static works only in static.
public class StaticVar {
    int x=10;
    static int y=20;
    void fun(){
        System.out.println("in fun");
    }
    static void gun(){
        System.out.println("in gun");
    }

    public static void main(String[] args) {
        StaticVar v=new StaticVar();
        System.out.println(v.x);
        System.out.println(y);
        v.fun();
        gun();

    }
}
