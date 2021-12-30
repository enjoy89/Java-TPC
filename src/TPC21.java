import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC21 {
    public static void main(String[] args) {
//        Animal animal = new Animal() --> 불가능함

        // 부모 클래스를 이용하여 (재정의가 되어있는) 하위 클래스를 동작시킴
        Animal dog = new Dog();
        dog.eat();  // 다형성 보장. 재정의가 되어 있어야만 가능함.
        dog.move(); // 부모 클래스에서 구현된 메소드 실행

        Animal cat = new Cat();
        cat.eat();  // 다형성 보장
        cat.move();
    }
}
