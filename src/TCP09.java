import kr.Book;

public class TCP09 {
    public static void main(String[] args) {
        // 객체 생성 과정
        // 객체를 생성한 후 접근 방법에는 .(dot) 연산자를 사용한다.
        // .(dot) 연산자는 public member만 접근 가능
        // 객체의 상태정보를 직접 접근하면 잘못된 데이터가 저장할 수 있다.
        // Information Hiding private 필요.

        Book book = new Book();
        book.title = "파이썬";
        book.price = 16000;
        book.company = "에이콘";

        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.company);
    }
}
