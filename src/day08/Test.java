package day08;

//import day08.fruit.Apple;
//import day08.fruit.Banana;
//import day08.fruit.Grape;
//impout는 패키지 클래스사이
import day08.fruit.*;

public class Test {

    public static void main(String[] args) {

        Apple apple1 = new Apple();
        // 다른 패키지에 있는 클래스는 플레임을 명시해야 한다.
        new Banana();
        new Grape();



    }
}
