import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC23 {
    public static void main(String[] args) {
        // RemoCon으로 TV class를 구동하기
        RemoCon r = new TV();
        for (int i = 0; i < 30; i++) {
            r.chUp();
        }
        for (int i = 0; i < 30; i++) {
            r.chDown();
        }
        r.internet();
    }
}
