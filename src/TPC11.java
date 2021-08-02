public class TPC11 {

    // non-static: 인스턴스 메소드
    // 객체생성 후 접근 가능
    public void tpc() {
        System.out.println("tpc");
    }

    // static이 붙어있는 경우: 클래스 메소드
    // 객체 생성 없이 클래스 이름으로 접근 가능
    public static void java() {
        System.out.println("java");

    }
    public static void main(String[] args) {
        TPC11.java();   // 클래스 메소드 사용

        // 객체생성 후 인스턴스 메소드 사용
        TPC11 tpc11 = new TPC11();
        tpc11.tpc();
    }
}
