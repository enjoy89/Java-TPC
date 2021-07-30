public class TPC08 {

    // static method call
    public static int add_1(int a, int b) {
        return a + b;
    }
    // non-static method call
    public int add_2(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // static이 붙으면 메모리의 method Area static zone에 저장됨
        // static 키워드는 static zone의 정적인 위치에 자동으로 로딩되도록 해주는 역할을 한다.
        int v1 = add_1(1, 2);
        System.out.println(v1);


        // 생성자(New) 연산자를 통해 객체를 생성하여 static이 붙어있지 않은 메소드 사용이 가능해짐.
        // 객체 생성 시 Heap 영역에 저장된다.
        TPC08 tpc08 = new TPC08();
        int v2 = tpc08.add_2(1, 2);
        System.out.println(v2);
    }
}
