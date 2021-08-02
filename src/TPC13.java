import kr.tpc.MemberVO;

public class TPC13 {
    public static void main(String[] args) {
        // 정보은닉(private): 다른 객체(class)로부터 접근을 막는 것
        // private 멤버변수를 접근할 때 -> setter, getter 메소드 활용
        MemberVO memberVO = new MemberVO();

        // setter 메소드를 이용하여 설정
        memberVO.setName("홍길동");
        memberVO.setAge(10);
        memberVO.setTel("010-1234-5678");
        memberVO.setAddr("서울");

        System.out.println(memberVO.toString());
    }
}
