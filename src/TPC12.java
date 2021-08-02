import kr.Book;

public class TPC12 {

    public static void bookPrint(Book book) {
        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.company);
    }

    public static void main(String[] args) {
        String title = "스프링";
        int price = 25000;
        String company = "제이펍";

        Book book;  // DTO(Data Transfer Object) -> 구체적인 대상을 가리키고 있지 않으므로 객체
        book = new Book();  // 인스턴스 변수가 생성됨
        book.title = title;
        book.price = price;
        book.company = company;

        bookPrint(book);

    }
}
