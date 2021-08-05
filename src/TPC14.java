public class TPC14 {
    public static void main(String[] args) {
        // Class란
        // (1) DataType 측면 -> 새로운 자료형을 만드는(설계하는) 도구 = 모델링 도구
        // (2) OOP(객체지향) 측면: 객체의 상태정보와 행위정보를 추출하여 캡슐화 하는 도구

        // Class를 Model이라고도 부름(역할이 정해지므로)
        // 1. DTO(Data Transfer Object): 데이터 구조, 데이터를 담는 역할.
        // 1-1. VO(Value Object): 객체를 담아서 하나의 값(덩어리)으로 취급함
        // 2. DAO(Data Access Object): 데이터를 처리하는 역할(비즈니스 로직), 데이터베이스와 CRUD하는 역할
        // 3. Utility(Helper Object): 도움을 주는 기능을 제공하는 역할(날쨔, 시간, 통화, 인고딩 등)

        // API
        String str = new String("BOOK");
        System.out.println(str.toLowerCase());

    }
}
