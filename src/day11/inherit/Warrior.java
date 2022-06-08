package day11.inherit;

// 자식 클래스 (sub class) 자식이 부모에게 상속달라고해야됌 + extends 부모클래스
public class Warrior extends Player{

    public int rage; // 분노게이지

    public Warrior(String name) {
        super(name); // Player() // super()은 생략돼있음
        //System.out.println("Warrior 생성자 호출!");
        this.level = 1; // 원칙적으론 super.level 이 맞다 level이 부모에게있어서
    }

    public void rush() {
        System.out.println(name + "님이 돌진합니다.");
    }
    // 오버라이딩은 시그니처를 부모가 한것 똑같이해야됌 /시그니처 = void showStatus() 등
    // 보안은 부모보다 더 빡센보안은돼도 안빡센 보안은안됌
    @Override // 오버라이딩 롤 체크
    public void showStatus() {
        super.showStatus(); // super = 부모 this = 나
        System.out.println("# rage : " + rage);
    }
}
