public class TPC04 {

    public static void sum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void sum_array(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // 데이터 이동 방법
        // 변수 vs 배열
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        sum(a, b, c);

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        sum_array(arr);
    }
}
