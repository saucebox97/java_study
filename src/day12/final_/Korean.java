package day12.final_;

public class Korean {

    String name; // 이름
    final String id; // 주민번호 public Korean에서 기본값해줌

    // 상수: 불변성과 유일성을 모두 만족 final=불변 static=유일
    // static 없으면 우회할수있음 생성자에 nation만들고 우회가능
    static final String nation; // 국적 final을 할려면 처음에 기본값이 있어야함

    static {
        nation = "대한민국";
    }

    public Korean(String name, String id) {
        this.name = name;
        this.id = id;
//        this.nation = nation;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 주민번호: " + id + ", 국적: " + nation;
    }

    // 주민번호를 바꾸는 메서드
    public void changeId(String id) {
//        this.id = id;
    }
}
