package day15.inter;

// 인터페이스: 객체의 규격을 표준화해서 명세하는 역할
public interface Pet {

    // 인터페이스는 객체화 될 수 없으며, 필드도 가질 수 없음
    // 또한 상수와 추상메서드만 선언가능
    // 인터페이스는 public static final 들어가있음 변수초기화해야됌
    String PLAY_GROUND = "애완동물 카페"; // 애완동물이 노는 장소
    // public abstract 들어가있음
    void play(); // 애완동물이 노는 기능

    default void smile() {} // default를 붙여주면 강제 오버라이딩을 막을수있다
    // 오버라이딩 = 상위 클래스가 가지고 있는 메서드를 하위 클래스가 재정의해서 사용
    // 예 = play 넣어야됌 하위 클래스는
}
