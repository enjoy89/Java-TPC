package kr.poly;

// 불완전한 객체 (추상클래스)
// 스스로 동작할 수 있는 객체 생성이 불가능함
// 부모의 역할로만 이용이 가능함. 부모가 자식에게 명령하여 다형성을 보장할 수 있음.
// Dog와 Cat처럼 기능이 서로 비슷한 클래스를 추상클래스인 Animal로 묶어서 표현하는 것이 일반적임.
public abstract class Animal {
    // Dog, Cat --> eat();
    public abstract void eat(); // 추상메소드 (불완전한 메소드)
    public void move() {
        System.out.println("무리를 지어서 이동한다.");
    }
}
