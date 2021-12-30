import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC22 {
    // 인터페이스와 추상화의 공통점: 다형성 보장하기 위한 개념
    // 인터페이스는 서로 기능이 다른 클래스의 공통 부분을 묶을 추상 메소드로 이루어짐.

    public static void main(String[] args) {
//        RemoCon remoCon = new RemoCon() 인터페이스는 객체 생성 불가능
        RemoCon remoCon = new TV();
        remoCon.chUp();
        remoCon.chDown();
        remoCon.internet();

        RemoCon remoCon2 = new Radio();
        remoCon2.chUp();
        remoCon2.chDown();
        remoCon2.internet();
    }
}
