package day12.final_;

class Child extends Parent{

//    void m1() {
//
//    }
    void m2() {
        String s;
    }
    void m4() {}
}

//public final class Parent { // 상속 제한
public class Parent { // final 상속을 못하게한다

    final void m1() {} // final 오버라이딩 제한
    void m2() {}
    void m3() {}
}
