import kr.Book;
import kr.Person;

public class TPC03 {
    public static void main(String[] args) {
        // PDU (기본 자료형) vs UDDT (사용자정의 자료형)

        // 변수 b의 자료형은? Book(객체)
        // Book 이라는 새로운 클래스를 생성하여 (새로운 자료형을 만들어) 변수 b를 선언함
        Book b = new Book();
        b.title = "제목";
        b.company = "출판사";
        b.price = 10;

        System.out.println("제목: " + b.title);
        System.out.println("출판사: " + b.company);
        System.out.println("가격: " + b.price);

        Person p = new Person();
        p.name = "전두이";
        p.age = 21;

        System.out.println("이름: " + p.name);
        System.out.println("나이: " + p.age);
    }
}
