package kr.poly;
//import java.lang.Object; // 생략 가능 1

public class A { // extends Object 생략 가능 2
    /* 생성자 생략 가능 3
    public A() {
        super();
    } */

    public void display() {
        System.out.println("나는 A이다.");
    }

    // 재정의
    @Override
    public String toString() {
        return "재정의된 메소드임";
    }
}
