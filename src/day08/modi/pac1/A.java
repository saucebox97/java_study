package day08.modi.pac1;

public class A {
// 접근제한자는 필드 생성자 메서드에만쓸수있다
    // 필드 선언
    public int f1;
    int f2; // default 제한 = 아무것도안쓰면 default처리
    private int f3;

    // 메서드 선언
    public void m1() {}
    void m2() {} // default 제한
    private void m3() {}

    public A() {
        f1 = 10;
        f2 = 20;
        f3 = 30;

        m1(); m2(); m3();
    }

    B b1 = new B("zzz");
    B b2 = new B(1);
//    B b3 = new B(3.1);
}
