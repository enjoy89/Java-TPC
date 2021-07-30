public class TPC06 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] makeArr() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        return arr;
    }

    public static void print(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // 메소드 -> 기능(function), 동작(method)
        // 메소드는 변수다?
        // 메소드의 이름이 변수명인 값을 전달하므로 변수처럼 사용된다.
        int a = 60;
        int b = 70;
        int value = sum(a, b);  // call by value
        System.out.println(value);

        int[] arr = makeArr();
        print(arr);
    }
}
