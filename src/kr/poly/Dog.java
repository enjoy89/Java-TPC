package kr.poly;

public class Dog extends Animal {
    public Dog() {
        super();    // new Animal();
    }
    // Override (재정의 = 부모 메소드 무시): 동적 바인딩 -> 호춮될 메소드가 실행시점에서 결정되는 바인딩
    // 메모리에 부모와 자식 메소드가 함께 공존하지만 결국에는 자식 메소드가 실행된다.
    @Override
    public void eat() {
        System.out.println("강아지가 밥을 먹는다.");
    }
}
