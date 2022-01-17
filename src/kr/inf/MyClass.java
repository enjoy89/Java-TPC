package kr.inf;

public class MyClass {
    public int sum(int a, int b) {
        int tmp = 0;
        for(int i=a; i<=b; i++) {
            tmp+=i;
        }
        return tmp;
    }
}
