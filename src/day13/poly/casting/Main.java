package day13.poly.casting;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.m1();
        parent.m2();

        System.out.println("====================");

        Parent child = new Child();
        child.m1();
        child.m2(); // 부모의것이 아닌 자신의 것이 선택됌
        ((Child)child).m3();

    }
}
