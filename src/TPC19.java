import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

    public static void display(Animal animal) { // 다형성 인수
        animal.eat();
        if (animal instanceof Cat) { // animal이 Cat타입으로부터 만들어진 인스턴스이면 true, 그렇지 않으면 false
            ((Cat) animal).night();      // downcasting
        }
    }

    public static void main(String[] args) {
        // message polymorphism (다형성)
        // 상속관계에 있는 클래스에서 상위클래스가 동일한 메시지로 하위클래스들을 서로 다르게 동작시키는 객체지향 원리
        //
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);

    }
}
