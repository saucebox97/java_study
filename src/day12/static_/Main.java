package day12.static_;

public class Main {

    public static void main(String[] args) {

        System.out.println(Count.y); // 객체를 생성하지않아도 접근가능 static이니까
        System.out.println(Math.PI);

        Count c1 = new Count();
        c1.x = 10;
        c1.x++;

        Count.y = 20;
        Count.y--;


        Count c2 = new Count();

        c2.x = 100;
        Count.y = 200; // static 은 공유 그래서 클래스이름.으로 참조함

        System.out.printf("c1.x: %d, c1.y: %d\n", c1.x, Count.y);
        System.out.printf("c2.x: %d, c2.y: %d", c2.x, Count.y);

        c1.m1();
        Count.m2();

    }
}
