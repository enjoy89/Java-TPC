package kr;

/**
 * Book(객체) -> 하나의 데이터 구조: VO(Value Object), DTO(Data Transfer Object)
 * 객체 생성: 객체를 설계하고 객체를 메모리 공간에 할당하는 행위
 * 상태 정보: 제목, 가격, 출판사
 * 행위 정보: 동작(메소드)
 */
public class Book {
    public String title;    // 제목
    public int price;       // 가격
    public String company;  // 출판사
}
