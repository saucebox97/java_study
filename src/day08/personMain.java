package day08;

public class personMain {

    public static void main(String[] args) {
    //생성자가 하나도없으면 기본생성자 자동 선언
        person p = new person("바보");

        System.out.println(p.age);
    }
}
