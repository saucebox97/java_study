package day14.quiz;

public class Child extends Parent{

    private String name;

    public Child() {
        this("홍길동"); // this() 쓰는순간 super() 사라짐 같이못쓰기떄문
        System.out.println("Child() call");
    }

    public Child(String name) {
        super(); // 이게 생략돼있음 월래 18강 점검문제 9번
        this.name = name;
        System.out.println("Child(String) call");
    }
}
