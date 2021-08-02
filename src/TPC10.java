public class TPC10 {

    // Inner Class 이므로 Static으로 선언해줌.
    public static class BookVO {
        private String title;
        private int price;
        private String company;

        // 생성자 메소드를 이용하여 객체를 초기화
        // this 연산자: 자기 자신을 가리키는 객체
        public BookVO(String title, int price, String company) {
            this.title = title;
            this.price = price;
            this.company = company;
        }
    }

    public static void main(String[] args) {
        // 생성자 메소드 (Constructor)
        // 객체를 생성할 때 사용되는 메소드
        // 객체 생성 후 객체를 초기화 하는 역할을 수행
        // 클래스이름과 동일한 메소드
        // 메소드의 return type이 없다.
        // 생성자가 없을 때는 기본 생성자(default constructor)가 만들어진다.
        BookVO book = new BookVO("파이썬", 16000, "에이콘");
        System.out.println(book.title);
        System.out.println(book.price);
        System.out.println(book.company);

    }
}
