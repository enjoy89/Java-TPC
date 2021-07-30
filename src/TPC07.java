public class TPC07 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int[] a) {
        int value = 0;
        for (int i = 0; i < a.length; i++) {
            value += a[i];
        }
        return value;
    }

    public static void main(String[] args) {
        // 메소드의 매개변수 전달기법
        int a = 10;
        int b = 20;
        int v1 = sum(a, b); // call by value
        System.out.println(v1);

        int[] arr = {10, 20};   // call by reference
        int v2 = sum(arr);
        System.out.println(v2);
    }
}
