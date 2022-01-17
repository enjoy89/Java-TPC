import kr.poly.A;

public class TPC25 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a); // 재정의가 되어 있지 않은 경우 생성된 객체의 번지수가 출력됨.

        /*
        Object object = new A();    // upcasting
        ((A)object).display();
        System.out.println(((A)object).toString());
         */
    }
}
