package kr.poly;

public class TV implements RemoCon {
    int currCh = 70;

    @Override
    public void chUp() {
        if(currCh < MAXCH) {
            currCh++;
            System.out.println("TV Channel up: " + currCh);
        } else {
            currCh = MINCH;
            System.out.println("TV Channel up: " + currCh);
        }
    }
    @Override
    public void chDown() {
        if(currCh > MINCH) {
            currCh--;
            System.out.println("TV Channel Down: " + currCh);
        } else {
            currCh = MAXCH;
            System.out.println("TV Channel Down: " + currCh);
        }
    }
    @Override
    public void internet() {
        System.out.println("Internet 동작");
    }
}
