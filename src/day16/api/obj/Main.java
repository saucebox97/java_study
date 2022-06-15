package day16.api.obj;

import utility.Util;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Pen p1 = new Pen(123, "빨강", 1000);
        Pen p2 = new Pen(new Company("모나미", "서울"),456, "노랑", 900);
        Pen p3 = new Pen(123, "초록", 1100);

        // p2를 복사해서 p4에 대힙
//        Pen p4 = new Pen(p2.serial, p2.color, p2.price);
//        Pen p4 = (Pen) p2.clone(); // clone 리턴이 Object
        Pen p4 = p2.deepClone();

        p2.color = "노오란색"; // 오브젝트에서 제공하는건 얕은복사 처음만 클론함
        p2.company.address = "부산";

        System.out.println("p2 = " + p2);
        System.out.println("p4 = " + p4);

        System.out.println(p1.equals(p3)); // 주소가 다름

        Util.line();

        Count c = null;
        for (int i = 0; i < 20; i++) {
            c = new Count(i + 1);
            c = null;
            System.gc(); // 가비지 컬렉터를 좀 더 발리 가동
        }
    }
}
