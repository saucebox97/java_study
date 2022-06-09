package day12.static_.singleton;

// 싱글톤 디자인 패턴 구현
public class Controller {

    public int number;

    // 2. 필드로 객체를 딱 하나 생성시키는데
    //    static제한을 걸어서 공유객체로 전환
    private static Controller con;

    static {
        con = new Controller();
    }

    // 1. 단 하나의 생성자에 private제한을 걸어
    //    외부에서 직접적으로 객체를 생성할 수 없도록 제한
    private Controller() {

    }

    //3. 준비된 단 하나의 객체를 public메서드를 통해 제공
    public static Controller getInstance() {
        if (con != null) return con; //최초 한번만 new 연산자를 통하여 메모리에 할당한다
        return new Controller(); // 이니셜 라이즈에서 넣어서 null 이 성립안됌 12~14줄
    }
}
