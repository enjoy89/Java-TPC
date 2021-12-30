package kr.poly;

public class TV implements RemoCon {

    @Override
    public void chUp() {
        System.out.println("TV Channel up");

    }

    @Override
    public void chDown() {
        System.out.println("TV Channel Down");

    }

    @Override
    public void internet() {
        System.out.println("Internet 동작");
    }
}
