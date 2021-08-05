import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC16 {
    public static void main(String[] args) {
        // 부모 클래스와 상속 관계의 있는 자식 클래스에게 접근함
        // 자동 형변환 (Object Casting)
        Animal dog = new Dog();     // Upcasting
        Animal cat = new Cat();

        // Override(재정의)를 통해 하위 클래스를 접근할 수 있다.
        dog.eat();
        cat.eat();

        ((Cat) cat).night();    // Downcasting
    }
}
