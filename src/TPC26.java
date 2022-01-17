import kr.tpc.*;

public class TPC26 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        display(a);
        display(b);

    }
    // 다형성 인수
    private static void display(Object o) {
        if(o instanceof A) {
            ((A)o).go();    // downcasting
        } else {
            ((B)o).go();
        }
    }
}
