public class TPC02 {
    public static void main(String[] args) {
        // 프로그래밍 3대 요소: 변수(Variable), 자료형(Data type), 할당(Assign)
        // 변수를 자료형을 이용하여 선언시, 메모리에 데이터를 저장하기 위한 공간이 할당됨
        // 새로운 자료형(객체)을 만드는 도구? Modeling 도구 -> 객체지향프로그래밍

        // 1 + 1 = 2;
        int num1, num2, num3;   // int 라는 자료형 클래스에 num1, num2, num3의 변수(인스턴스)를 생성함
        num1 = 1;
        num2 = 1;
        num3 = num1 + num2;
        System.out.println(num3);

        // float, double
        float f;
        f = 14.5f;
        System.out.println(f);

        // char, string
        char c;
        c = 'a';
        System.out.println(c);

        boolean b;
        b = true;   // true/false
        System.out.println(b);

    }
}
