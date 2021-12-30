package kr.poly;

public class Radio implements RemoCon {
    @Override
    public void chUp() {
        System.out.println("Radio Channel up");
    }

    @Override
    public void chDown() {
        System.out.println("Radio Channel Down");
    }

    @Override
    public void internet() {
        System.out.println("Internet 동작 안함");
    }
}
