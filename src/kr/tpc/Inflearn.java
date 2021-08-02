package kr.tpc;

public class Inflearn {

    // 생성자가 private인 경우? 객체 생성 불가능
    private Inflearn() {
    }

    //  인스턴스메서드
    // non-static: 인스턴스 메소드
    // 객체생성 후 접근 가능
    public void tpc() {
        System.out.println("TPC강의 너무 재미있다.");
    }

    //  클래스메서드
    // static이 붙어있는 경우: 클래스 메소드
    // 객체 생성 없이 클래스 이름으로 접근 가능
    public static void java() {
        System.out.println("Java강의 너무 재미있다.");
    }
}


