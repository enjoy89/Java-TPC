import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC17 {
    public static void main(String[] args) {
        // 상속관계에서 객체생성 방법
        // 1. 직접 이용 (하위 클래스의 기능을 모두 인지하고 있다고 가정)
        Dog dog = new Dog();
        dog.eat();
        Cat cat = new Cat();
        cat.eat();
        cat.night();

        // 2. 상위클래스(부모)를 활용 (하위 클래스의 동작 방식을 모를 때 간접적으로 이용이 가능함)
        Animal dog_ani = new Dog();
        dog_ani.eat();
        Animal cat_ani = new Cat();
        cat_ani.eat();
        ((Cat) cat_ani).night();
    }
}
