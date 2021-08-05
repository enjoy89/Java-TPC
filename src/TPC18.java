import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC18 {
    public static void main(String[] args) {
        // 부모 자식간 형변환
        Animal animal = new Cat();
        animal.eat();   // 컴파일 시점: Animal, 실행 시점: Cat

        animal = new Dog();
        animal.eat();   // 컴파일 시점: Animal, 실행 시점: Dog

        // 다형성
        // 상위클래스가 하위클래스에게 동일한 메시지로 서로 다르게 동작시키는 원리
    }
}
