import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void display(Animal[] animals) {      // 다형성 배열 사용
        for (Animal animal : animals) {
            animal.eat();
            if (animal instanceof Cat) {
                ((Cat) animal).night();
            }
        }
    }

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        display(animals);
    }
}
