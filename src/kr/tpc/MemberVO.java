package kr.tpc;

public class MemberVO {
    // private으로 객체의 상태를 보호함
    // 정보은닉(information hiding)
    // private으로 만들어진 멤버변수를 접근하기 위해서 setter, getter method를 만든다.
    private String name;
    private int age;
    private String tel;
    private String addr;

    public MemberVO() {
    }

    public MemberVO(String name, int age, String tel, String addr) {
        this.name = name;
        this.age = age;
        this.tel = tel;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "MemberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tel='" + tel + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
