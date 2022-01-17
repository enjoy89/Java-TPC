import kr.inf.MyClass;

public class TPC27 {
    public static void main(String[] args) {
        // package 접근 방법
        kr.inf.MyClass mc = new MyClass();
        int v = mc.sum(10, 100);
        System.out.println(v);
    }
}

