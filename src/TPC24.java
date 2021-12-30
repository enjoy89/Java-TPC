public class TPC24 {
    public static void main(String[] args) {
        // 인터페이스와 JDBC의 관계
        // Oracle, MySQL --> Driver class 필요
        // 인터페이스 기반으로 만들어지므로 데이터베이스 프로그램의(하위 프로그램) 동작의 자세한 내용을 몰라도 동작 제어 가능.
        DBConnect dbConnect = new JavaOracle();
        dbConnect.getConnection("url", "bit", "12345");

        DBConnect dbConnect1 = new JavaMySQL();
        dbConnect1.getConnection("url", "bit2", "678910");
    }
}
