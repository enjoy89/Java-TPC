import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC15 {
    public static void main(String[] args) {
        // 상속 -> 클래스의 설계
        // 1. 수평적 설계 -> 코드의 중복이 발생할 수 있음. 관리하기가 어려움.
        // 2. 수직적 설계 (계층화, 상속구조) -> 수평적 설계의 단점을 극복할 수 있음. 확장이 가능해짐.
        // super class (상위, 부모) -> 추상화, 보편화, 일반화, 개념화
        // sub class (하위, 자식) -> 세분화, 상세화, 구체화, 구상화

        // 상속에서 부모와 자식에 연결되는 방법 -> super(): 자신의 생성자에서 부모의 생성자를 호출
        // Dog, Cat -> Animal
        // 부모한테 있는 eat() 메소드를 호출함.
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
    }
}
