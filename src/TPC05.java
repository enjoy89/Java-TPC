public class TPC05 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;

        arr[1][0] = 3;
        arr[1][1] = 4;
        arr[1][2] = 5;

        arr[2][0] = 6;
        arr[2][1] = 7;
        arr[2][2] = 8;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // 가변길이 배열
        int[][] star = new int[5][];
        star[0] = new int[1];
        star[1] = new int[2];
        star[2] = new int[3];
        star[3] = new int[4];
        star[4] = new int[5];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                star[i][j] = (char) '*';
                System.out.print((char) star[i][j]);
            }
            System.out.println();
        }
    }
}
