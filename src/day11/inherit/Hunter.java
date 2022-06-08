package day11.inherit;

public class Hunter extends Player{

    public int arrow; // 화살 수

    public Hunter(String name) {
        super(name);
        this.arrow = 1000;
    }
    // 매서드

    public void blazeShot() {
        System.out.println(name + "님이 폭발 화살을 시전합니다");
    }

    @Override // 오버라이딩 롤 체크
    public void showStatus() {
        super.showStatus(); // super = 부모 this = 나
        System.out.println("# arrow : " + arrow);
    }
}
