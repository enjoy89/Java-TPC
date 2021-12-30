package kr.poly;

public interface RemoCon {
    // 추상 메소드이므로 body 부분 구현 불가능
    // abstract 키워드 생략 가능
    // 객체 생성 불가능

    // 상수 사용 가능. 객체 생성 없이 사용할 수 있는 이유는 static의 존재 때문임.
    // final 변수이므로 변경 불가능 = 상수.
    // public static final 생략 가능
    int MAXCH = 100;
    int MINCH = 1;

    // 추상 메소드 --> 구현 메소드는 가질 수 없음.
    void chUp();

    void chDown();

    void internet();
}
